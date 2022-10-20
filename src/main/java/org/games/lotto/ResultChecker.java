package org.games.lotto;

import java.util.Collection;
import java.util.Set;
import org.games.ConfigurationProvider;

class ResultChecker {

    private final LottoConfiguration configuration;

    ResultChecker(ConfigurationProvider configuration) {
        this.configuration = configuration.loadConfiguration();
    }

    boolean check(Collection<Integer> winningNumbers, Collection<Integer> userNumbers) {
        boolean didUserWon = winningNumbers.equals(userNumbers);
        if (didUserWon) {
            System.out.println("Lucky numbers today: " + winningNumbers);
            System.out.println("You won $ " + configuration.getCashPrize());
            return true;
        }
        System.out.println("Lucky numbers today: " + winningNumbers
                + "\n Your types: " + userNumbers + "\n You are the loser XD");
        return false;
    }
}
