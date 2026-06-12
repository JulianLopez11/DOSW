package edu.dosw.lab.Reto4;

import java.math.BigDecimal;

/**
 * Represents a movement (transaction) between two accounts
 * @author  Tulio Riaño, Juan Puentes , Julian Lopez
 * @version 1.0
 */
public class Movement {
    private ValidateAccount validate;
    /**
     * Default constructor.
     */
    public Movement() {
        validate = new ValidateAccount();
    }

    /**
     * Executes a money transfer between two accounts.
     * @param account     source account 
     * @param amount      amount of money to transfer
     * @param destination destination account (to which money will be added)
     * @throws Exception if the destination account number is invalid
     */
    public void doMovement(Account account, BigDecimal amount, Account destination) throws Exception {
        if (validate.validateAccount(destination.getNumberAccount())) {
            account.setBalance(account.getBalance().subtract(amount));
            destination.setBalance(destination.getBalance().add(amount));
        } else {
            throw new Exception("Invalid account number.");
        }
    }
}
