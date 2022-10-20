package org.games.lotto;

import java.util.Set;

class ResultChecker {

    boolean check(Set<Integer> winningNumbers, Set<Integer> userNumbers) {
        boolean didUserWon = winningNumbers.equals(userNumbers);
        if (didUserWon) {
            System.out.println("Lucky numbers today: " + winningNumbers);
            System.out.println("You won $ " + LotteryParameters.getCashPrize());
            return true;
        }
        System.out.println("Lucky numbers today: " + winningNumbers
                + "\n Your types: " + userNumbers + "\n You are the loser XD");
        return false;
    }
}
