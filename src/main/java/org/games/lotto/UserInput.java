package org.games.lotto;

import java.util.*;

import org.games.ConfigurationProvider;

public class UserInput implements UserNumbersReading {
    private final LottoConfiguration configuration;
    Set<Integer> typedNumbers = new HashSet<>();

    public UserInput(LottoConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public Collection<Integer> readUserNumbers() {
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
