package edu.dosw.lab.Reto4;

import java.math.BigDecimal;

/**
 * Represents a customer of the banking system.
 * 
 * @author Tulio Riaño, Juan Puentes, Julian Lopez
 * @version 1.1
 */
public class Customer {
    private String name;
    private BankifyFacade bankifyFacade;
    private Account account;

    /**
     * Creates a new customer with the given name.
     * Initializes the bank facade
     * 
     * @param name customer's name
     */
    public Customer(String name, BankifyFacade bankifyFacade) {
        this.name = name;
        this.bankifyFacade = bankifyFacade;
    }

    /**
     * Creates a new account for this customer.
     * 
     * @param name name of the account holder
     * @return the newly created account
     */
    public Account createAccount(String name) {
        this.account = bankifyFacade.createAccount(name);
        return this.account;
    }

    /**
     * Performs a movement from the given account to another account.
     * 
     * @param account       source account
     * @param amount        amount of money to transfer
     * @param numberAccount destination account number
     */
    public void doMovement(BigDecimal amount, String numberAccount) {
        try {
            bankifyFacade.doMovement(account, amount, numberAccount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Consults the details of an account by its number.
     * 
     * @param numberAccount account number to consult
     * @return string with the account details
     */
    public String consultAccount(String numberAccount) {
        return bankifyFacade.consultAccount(numberAccount);
    }

    /**
     * Gets the customer's name.
     * 
     * @return customer's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the facade used by the customer.
     * 
     * @return instance
     */
    public BankifyFacade getBankifyFacade() {
        return bankifyFacade;
    }

    /**
     * Sets the customer's name.
     * 
     * @param name new customer name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}
