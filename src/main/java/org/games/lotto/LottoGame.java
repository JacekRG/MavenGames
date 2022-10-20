package org.games.lotto;

import java.util.Collection;
import org.games.ConfigurationProvider;

public class LottoGame {

    private final WinningNumberGenerable numbersGenerator;

    public LottoGame(WinningNumberGenerable numbersGenerator) {
        this.numbersGenerator = numbersGenerator;
    }

    public boolean start(ConfigurationProvider configuration) {
        UserInput userInput = new UserInput(configuration);
        ResultChecker resultChecker = new ResultChecker(configuration);

        Collection<Integer> winningNumbers = numbersGenerator.generateNumbers();
        Collection<Integer> typing = userInput.readUserNumbers();
        return resultChecker.check(winningNumbers, typing);
    }
}
