package org.games.lotto;

import java.util.Set;
import org.games.NumbersGenerator;
import org.games.Playable;

public class LottoGame implements Playable {

    private final NumbersGenerator numbersGenerator;

    public LottoGame(NumbersGenerator numbersGenerator) {
        this.numbersGenerator = numbersGenerator;
    }

    @Override
    public boolean start() {
        NumbersGenerator dailyLuckyNumbers = new NumbersGenerator();
        UserInput userInput = new UserInput();
        ResultChecker resultChecker = new ResultChecker();


        Set<Integer> winningNumbers = dailyLuckyNumbers.generateNumbers();
        Set<Integer> typing = userInput.readUserNumbers();
        return resultChecker.check(winningNumbers, typing);
    }
}
