package org.lotto;

import java.util.HashSet;
import java.util.Set;

public class NumbersGenerator {
    Set<Integer> luckyNumbers = new HashSet<>();

    public Set<Integer> generateNumbers() {
        while (luckyNumbers.size() < LotteryParameters.getLotterySize()) {
            luckyNumbers.add((int) (Math.floor(Math.random() * LotteryParameters.getNumbersRange()) + 1));
        }
        return luckyNumbers;
    }
}
