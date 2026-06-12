package edu.dosw.lab.Reto3;

import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    private static List<Integer> validVotes = Arrays.asList(1, 2, 3, 5, 8, 13);

    public static boolean isValidVote(int vote) {
        return validVotes.contains(vote);
    }
}