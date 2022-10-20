package org.games.lotto;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class NumbersGenerator implements WinningNumberGenerable {
    private final LottoConfiguration configuration;
    Set<Integer> luckyNumbers = new HashSet<>();

    public NumbersGenerator(LottoConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public Collection<Integer> generateNumbers() {
        while (luckyNumbers.size() < configuration.getLotterySize()) {
            luckyNumbers.add((int) (Math.floor(Math.random() * configuration.getNumbersRange()) + 1));
        }
        return luckyNumbers;
    }
}
