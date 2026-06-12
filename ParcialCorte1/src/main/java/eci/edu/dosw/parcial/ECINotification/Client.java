package eci.edu.dosw.parcial.ECINotification;

public class Client {
    private String nombre;
    private Preference preference;

    public Client(String nombre) {
        this.nombre = nombre;
    }

    public String getName() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPreference(Preference preference){
        this.preference = preference;
    }

    public Preference getPreference(){
        return preference;
    }
}
