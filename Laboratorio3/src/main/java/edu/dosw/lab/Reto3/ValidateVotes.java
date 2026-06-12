package edu.dosw.lab.Reto3;

import java.util.*;

public class ValidateVotes {
    private static Fibonacci fibonacci;

    public static boolean validateVotesFibonacci(List<Integer> votes) {
        for (int vote : votes) {
            if (!Fibonacci.isValidVote(vote)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkAmountVotes(List<Integer> votes) {
        int firstVote = votes.get(0);
        for (int i = 1; i < votes.size(); i++) {
            if (votes.get(i) != firstVote) {
                return false;
            }
        }
        return true;
    }
}