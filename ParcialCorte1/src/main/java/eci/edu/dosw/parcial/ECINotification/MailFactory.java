package eci.edu.dosw.parcial.ECINotification;

public class MailFactory implements NotificationFactory {
    protected String mail; 
    @Override
    public void createNotification(){
        System.out.println("Esta es una notificacion De Mail enviado a su correo" );
    }  

    public NotificationStrategy getStrategy() {
        return new MailStrategy();
    }
    
}
