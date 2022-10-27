package org.games.lotto;

import java.util.Collection;
import java.util.Set;

public class WinningNumbersGeneratorTestImpl implements WinningNumberGenerable {
    Collection<Integer> numbers;

    WinningNumbersGeneratorTestImpl(Collection<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public Collection<Integer> generateNumbers() {
        return numbers;
    }
}
