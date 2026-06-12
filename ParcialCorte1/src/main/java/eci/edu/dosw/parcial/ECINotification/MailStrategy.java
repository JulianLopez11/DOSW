package eci.edu.dosw.parcial.ECINotification;
public class MailStrategy extends NotificationStrategy {
    @Override
    public void sendNotification(Priority priority) {
        System.out.println("Enviando notificación por Mail. Prioridad: " + priority);
    }
}
