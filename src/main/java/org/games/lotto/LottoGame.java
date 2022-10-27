package org.games.lotto;

import java.util.Collection;

import org.games.ConfigurationProvider;

public class LottoGame {
    private final WinningNumberGenerable numbersGenerator;
    private final UserNumbersReading userInput;

    public LottoGame(WinningNumberGenerable numbersGenerator, UserNumbersReading userInput) {
        this.numbersGenerator = numbersGenerator;
        this.userInput = userInput;
    }

    public boolean start(ConfigurationProvider configuration) {
        ResultChecker resultChecker = new ResultChecker(configuration);
        Collection<Integer> winningNumbers = numbersGenerator.generateNumbers();
        Collection<Integer> typing = userInput.readUserNumbers();
        return resultChecker.check(winningNumbers, typing);
    }
}
