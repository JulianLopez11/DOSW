package eci.edu.dosw.parcial.ECINotification;

public class Preference {
    private NotificationStrategy strategy;
    private Priority priority; 

    public Preference(NotificationStrategy strategy, Priority priority) {
        this.strategy = strategy;
        this.priority = priority;
    }

    public NotificationStrategy getStrategy() {
        return strategy;
    }

    public Priority getPriority() {
        return priority;
    }
}
