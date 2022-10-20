package org.games.lotto;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

class UserInput {
    Set<Integer> typedNumbers = new HashSet<>();

    Set<Integer> readUserNumbers() {
        Scanner userEnteredNumber    = new Scanner(System.in);
        int typingCounter = 1;
        while (typedNumbers.size() < LotteryParameters.getLotterySize()) {
            System.out.println("Insert " + typingCounter + " of " + LotteryParameters.getLotterySize() + " numbers");
            int userProposal;
            try {
                userProposal = userEnteredNumber.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("The value entered is not a number, you have wasted your coupon");
                break;
            }
            if (userProposal < 1 || userProposal > LotteryParameters.getNumbersRange()) {
                System.out.println("Number out of range");
            } else if (!typedNumbers.contains(userProposal)) {
                typingCounter++;
                typedNumbers.add(userProposal);
            } else System.out.println("You have already entered this number");
        }
        return typedNumbers;
    }
}
