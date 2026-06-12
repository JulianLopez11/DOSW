package eci.edu.dosw.parcial.ECINotification;

public enum Priority {
    ALTA(1),MEDIA(2),BAJA(3);
    private final int level;
    Priority(int level){ 
        this.level = level; 
    }
    public int getLevel(){
        return level;
    }
}
