package eci.edu.dosw.parcial.ECINotification;

public class SMSFactory implements NotificationFactory {
    protected int phoneNumber; 
    @Override
    public void createNotification(){
        System.out.println("Esta es una notificacion De SMS enviado a su numero");
    }  

    public NotificationStrategy getStrategy() {
        return new SMSStrategy();
    }
    
}
