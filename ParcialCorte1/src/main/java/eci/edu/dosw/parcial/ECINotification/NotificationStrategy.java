package eci.edu.dosw.parcial.ECINotification;

public abstract class NotificationStrategy {
    public Priority priority;
    public abstract void sendNotification(Priority priority);

    public Priority getPriority(){
        return priority;
    }
    
}
