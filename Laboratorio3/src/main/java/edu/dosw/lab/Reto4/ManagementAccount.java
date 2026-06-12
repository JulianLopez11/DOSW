package edu.dosw.lab.Reto4;

import java.util.*;

/**
 * Provides account management operations such as creating new accounts.
 * @author  Tulio Riaño, Juan Puentes , Julian Lopez
 * @version 1.0
 */
public class ManagementAccount {
    private ValidateAccount ValidateRegister;
    private Random random;

    /**
     * Default constructor.
     */
    public ManagementAccount() {
        random = new Random();
    }

    /**
     * Creates a new account with a generated account number.
     * @param name account holder's name
     * @return a new instance with the generated number
     */
    public Account createAccount(String name) {
        String number = "";
        List<String> initials = Arrays.asList("01", "02");
        number += initials.get(random.nextInt(2));
        for (int i = 0; i < 8; i++) {
            String numberAccount = Integer.toString(random.nextInt(10));
            number += numberAccount;
        }
        return new Account(name, number);
    }

}
