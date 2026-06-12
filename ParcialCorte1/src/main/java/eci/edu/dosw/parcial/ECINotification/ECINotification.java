package eci.edu.dosw.parcial.ECINotification;

import java.util.*;

public class ECINotification {
    private List<Client> clients;

    public ECINotification() {
        clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void notifyAllClients(Priority priority) {
        for (Client client : clients) {
            Preference preference = client.getPreference();
            if (preference.getPriority() == priority) {
                preference.getStrategy().sendNotification(priority);
            }
        }
    }

    public static void ejecutar() {
        ECINotification system = new ECINotification();

        MailFactory mailFactory = new MailFactory();
        mailFactory.createNotification();
        NotificationStrategy mailStrategy = mailFactory.getStrategy();

        Client client1 = new Client("Ana");
        client1.setPreference(new Preference(mailStrategy, Priority.BAJA));
        system.addClient(client1);

    
        SMSFactory smsFactory = new SMSFactory();
        smsFactory.createNotification();
        NotificationStrategy smsStrategy = smsFactory.getStrategy();

        Client client2 = new Client("Luis");
        client2.setPreference(new Preference(smsStrategy, Priority.MEDIA));
        system.addClient(client2);

        MobileFactory mobileFactory = new MobileFactory();
        mobileFactory.createNotification();
        NotificationStrategy mobileStrategy = mobileFactory.getStrategy();

        Client client3 = new Client("Sara");
        client3.setPreference(new Preference(mobileStrategy, Priority.ALTA));
        system.addClient(client3);

        System.out.println("\n--- Notificando prioridad ALTA ---");
        system.notifyAllClients(Priority.ALTA);
        System.out.println("\n--- Notificando prioridad MEDIA ---");
        system.notifyAllClients(Priority.MEDIA);
        System.out.println("\n--- Notificando prioridad BAJA ---");
        system.notifyAllClients(Priority.BAJA);
    }
}
