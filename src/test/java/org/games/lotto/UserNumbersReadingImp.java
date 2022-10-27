package org.games.lotto;

import java.util.Collection;

public class UserNumbersReadingImp implements UserNumbersReading {

    Collection<Integer> numbers;

    UserNumbersReadingImp(Collection<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public Collection<Integer> readUserNumbers() {
        return numbers;
    }
}
