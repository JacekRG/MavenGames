package org.games.lotto;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import org.games.ConfigurationProvider;

class UserInput {

    private final LottoConfiguration configuration;
    Set<Integer> typedNumbers = new HashSet<>();

    UserInput(ConfigurationProvider configuration) {
        this.configuration = configuration.loadConfiguration();
    }

    Set<Integer> readUserNumbers() {
        Scanner userEnteredNumber = new Scanner(System.in);
        int typingCounter = 1;
        while (typedNumbers.size() < configuration.getLotterySize()) {
            System.out.println("Insert " + typingCounter + " of " + configuration.getLotterySize() + " numbers");
            int userProposal;
            try {
                userProposal = userEnteredNumber.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("The value entered is not a number, you have wasted your coupon");
                break;
            }
            if (userProposal < 1 || userProposal > configuration.getNumbersRange()) {
                System.out.println("Number out of range");
            } else if (!typedNumbers.contains(userProposal)) {
                typingCounter++;
                typedNumbers.add(userProposal);
            } else System.out.println("You have already entered this number");
        }
        return typedNumbers;
    }
}
