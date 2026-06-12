package eci.edu.dosw.parcial.ECINotification;

public class SMSStrategy extends NotificationStrategy {
    @Override
    public void sendNotification(Priority priority) {
        System.out.println("Enviando notificación por SMS. Prioridad: " + priority);
    }
}
