package edu.dosw.lab.Reto4;

/**
 * Utility class used to validate account numbers.
 * @author  Tulio Riaño, Juan Puentes , Julian Lopez
 * @version 1.0
 */
public class ValidateAccount {
    /**
     * Validates an account number according to the system rules.
     * @param numberAccount the account number to validate
     * @return boolean if the account starts with the prefixes or not
     */
    public boolean validateAccount(String numberAccount) {
        return numberAccount.startsWith("01") || numberAccount.startsWith("02");
    }
}
