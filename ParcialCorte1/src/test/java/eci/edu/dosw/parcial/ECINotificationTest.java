package eci.edu.dosw.parcial;

import org.junit.jupiter.api.Test;

import eci.edu.dosw.parcial.ECINotification.ECINotification;
import eci.edu.dosw.parcial.ECINotification.MailStrategy;
import eci.edu.dosw.parcial.ECINotification.MobileStrategy;
import eci.edu.dosw.parcial.ECINotification.NotificationStrategy;
import eci.edu.dosw.parcial.ECINotification.Preference;
import eci.edu.dosw.parcial.ECINotification.SMSStrategy;
import eci.edu.dosw.parcial.ECINotification.Client;
import eci.edu.dosw.parcial.ECINotification.Priority;
import eci.edu.dosw.parcial.ECINotification.SMSFactory;
import eci.edu.dosw.parcial.ECINotification.MobileFactory;
import eci.edu.dosw.parcial.ECINotification.MailFactory;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ECINotificationTest {

    @Test
    public void testNotifyOnlyClientsWithMatchingPriority() {
        ECINotification system = new ECINotification();

        MobileStrategy highStrategy = new MobileStrategy();
        Client highClient = new Client("Ana");
        highClient.setPreference(new Preference(highStrategy, Priority.ALTA));
        system.addClient(highClient);

        SMSStrategy mediumStrategy = new SMSStrategy();
        Client mediumClient = new Client("Luis");
        mediumClient.setPreference(new Preference(mediumStrategy, Priority.MEDIA));
        system.addClient(mediumClient);
        system.notifyAllClients(Priority.ALTA);

    }

    @Test
    public void testClientSetAndGetPreference() {
        Client client = new Client("Carlos");
        NotificationStrategy strategy = new MailStrategy();
        Preference preference = new Preference(strategy, Priority.BAJA);

        client.setPreference(preference);

        assertEquals(preference, client.getPreference());
        assertEquals(Priority.BAJA, client.getPreference().getPriority());
    }

    @Test
    public void testSendNotificationPrintsMessage() {
        MailStrategy strategy = new MailStrategy();
        strategy.sendNotification(Priority.BAJA);  
    }

    @Test
    public void testFullSystemExecution() {
        ECINotification system = new ECINotification();

        Client c1 = new Client("Pedro");
        c1.setPreference(new Preference(new MailStrategy(), Priority.BAJA));

        Client c2 = new Client("Lucia");
        c2.setPreference(new Preference(new SMSStrategy(), Priority.MEDIA));

        Client c3 = new Client("Jorge");
        c3.setPreference(new Preference(new MobileStrategy(), Priority.ALTA));

        system.addClient(c1);
        system.addClient(c2);
        system.addClient(c3);

        system.notifyAllClients(Priority.MEDIA);
    
    }
    @Test
    void testSetAndGetPreference() {
        Client client = new Client("Juan");
        Preference preference = new Preference(new MailStrategy(), Priority.ALTA);
        client.setPreference(preference);
        assertEquals(preference, client.getPreference());
    }

    @Test
    void testGetName() {
        Client client = new Client("Maria");
        assertEquals("Maria", client.getName());
    }

    @Test
    public void testCreateNotificationMobileFactory() {
        MobileFactory mobileFactory = new MobileFactory();
        mobileFactory.createNotification();
    }

    @Test
    public void testCreateNotificationSmsFactory() {
        SMSFactory smsFactory = new SMSFactory();
        smsFactory.createNotification();
    
    }

    @Test
    public void testCreateNotificationMailDFactory() {
        MailFactory mailFactory = new MailFactory();
        mailFactory.createNotification();
    
    }

    


    
}


