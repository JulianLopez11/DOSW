package edu.dosw.lab.Reto4;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Facade class that provides simplified access to the banking system
 * operations.
 * 
 * @author Tulio Riaño , Juan Puentes , Julian Lopez
 * @version 1.0
 */
public class BankifyFacade {
    private ManagementAccount managementAccount;
    private ArrayList<Account> accounts;
    private ArrayList<Customer> customers;

    /**
     * Default constructor.
     */
    public BankifyFacade() {
        accounts = new ArrayList<>();
        managementAccount = new ManagementAccount();
        customers = new ArrayList<>();
    }

    /**
     * Creates a new account with the given account name.
     * 
     * @param name account holder's name
     * @return the newly created account
     */
    public Account createAccount(String name) {
        Account newAccount = managementAccount.createAccount(name);
        accounts.add(newAccount);
        customers.stream()
                .filter(a -> a.getName().equals(name))
                .findAny()
                .ifPresent(a -> a.setAccount(newAccount));
        return newAccount;
    }

    /**
     * Consults account information by its account number.
     * 
     * @param numberAccount the account number to search for
     * @return a string with the account details (name, number, balance)
     */
    public String consultAccount(String numberAccount) {
        Account result = accounts.stream()
                .filter(a -> a.getNumberAccount().equals(numberAccount))
                .findFirst()
                .orElse(null);
        return result != null ? result.consultAccount(numberAccount) : null;
    }

    /**
     * Returns the list of all accounts registered in the system.
     * 
     * @return list of accounts
     */
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    /**
     * Executes a movement from the given account to another account
     * identified by its account number.
     * 
     * @param account       source account
     * @param amount        amount of money to transfer
     * @param numberAccount destination account number
     * @throws Exception possibles errors
     */
    public void doMovement(Account account, BigDecimal amount, String numberAccount) throws Exception {
        Account account2 = accounts.stream()
                .filter(a -> a.getNumberAccount().equals(numberAccount))
                .findAny()
                .orElse(null);
        account.doMovement(amount, account2);
    }

}
