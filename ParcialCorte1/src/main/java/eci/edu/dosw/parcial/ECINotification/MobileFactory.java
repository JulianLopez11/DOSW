package eci.edu.dosw.parcial.ECINotification;

public class MobileFactory implements NotificationFactory {
    protected int phoneNumber;
    protected String type; 
    @Override
    public void createNotification(){
        System.out.println("Esta es una notificacion Pop De su telefono enviado a su numero");
    }  


    public String getType(){
        return type;
    }

    public NotificationStrategy getStrategy() {
        return new MobileStrategy();
    }
    
}
