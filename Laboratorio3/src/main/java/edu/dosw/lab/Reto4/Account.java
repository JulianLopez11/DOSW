package edu.dosw.lab.Reto4;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Represents a bank account with an account number, an account name,
 * a balance, and a list of movements (transactions).
 * 
 * @author Tulio Riaño - Juan Puentes - Julian Lopez
 * @version 1.0
 */
public class Account {
    private String name;
    private BigDecimal balance;
    private String numberAccount;
    private ArrayList<Movement> movements;

    /**
     * Default constructor.
     */
    public Account() {

    }

    /**
     * Creates a new account with the given account name and account number.
     * The initial balance is set to 0.
     * 
     * @param name          account name
     * @param numberAccount account number
     */
    public Account(String name, String numberAccount) {
        this.name = name;
        this.numberAccount = numberAccount;
        movements = new ArrayList<>();
        balance = new BigDecimal(0);
    }

    /**
     * Gets the account name.
     * 
     * @return account name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the account number.
     * 
     * @return account number
     */
    public String getNumberAccount() {
        return numberAccount;
    }

    /**
     * Gets the current account balance.
     * 
     * @return current balance
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Returns a string with the account details: name, account number, and balance.
     *
     * @param numberAccount account number to be consulted
     * @return string containing account name, account number, and balance
     */
    public String consultAccount(String numberAccount) {
        return this.getName() + " " + this.getNumberAccount() + " " + this.getBalance().toString();
    }

    /**
     * Performs a movement from this account to a destination account.
     *
     * @param amount      the amount of money to transfer
     * @param destination the destination account that will receive the money
     * @throws Exception possibles errors
     */
    public void doMovement(BigDecimal amount, Account destination) throws Exception {
        Movement movement = new Movement();
        movements.add(movement);
        movement.doMovement(this, amount, destination);
    }

    /**
     * Updates the account balance.
     * 
     * @param balance new balance to be set
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

}
