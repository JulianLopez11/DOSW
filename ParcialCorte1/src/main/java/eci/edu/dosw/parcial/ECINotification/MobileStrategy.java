package eci.edu.dosw.parcial.ECINotification;
public class MobileStrategy extends NotificationStrategy {
    @Override
    public void sendNotification(Priority priority) {
        System.out.println("Enviando notificación por Mobile. Prioridad: " + priority);
    }
}
