package org.games.lotto;

import java.util.Set;

import org.games.ConfigurationProvider;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LottoGameTest {

    @Test
    public void should_return_success_when_user_gave_six_numbers() {
        // given
        Set<Integer> numbersGenerated = Set.of(1, 2, 3, 4, 5, 6);
        Set<Integer> userNumbersInputted = Set.of(1, 2, 3, 4, 5, 6);
        ConfigurationProvider configurationProvider = new LottoConfigurationLoaderTestImpl();
        WinningNumberGenerable numbersGenerator = new WinningNumbersGeneratorTestImpl(numbersGenerated);
        UserNumbersReading userNumbersInput = new UserNumbersReadingImp(userNumbersInputted);
        LottoGame lottoGame = new LottoGame(numbersGenerator, userNumbersInput);
        // when
        boolean result = lottoGame.start(configurationProvider);
        // then
        assertThat(result).isTrue();
    }

    @Test
    public void should_return_failed_when_user_gave_less_than_six_numbers() {
        // given
        Set<Integer> numbersGenerated = Set.of(1, 2, 3, 4, 5, 6);
        Set<Integer> userNumbersInputed = Set.of(9, 8);
        ConfigurationProvider configurationProvider = new LottoConfigurationLoaderTestImpl();
        WinningNumberGenerable numbersGenerator = new WinningNumbersGeneratorTestImpl(numbersGenerated);
        UserNumbersReading userNumbersInput = new UserNumbersReadingImp(userNumbersInputed);
        LottoGame lottoGame = new LottoGame(numbersGenerator, userNumbersInput);
        // when
        boolean result = lottoGame.start(configurationProvider);
        // then
        assertThat(result).isFalse();
    }

    @Test
    public void should_return_failed_when_user_gave_more_than_six_numbers() {
        // given
        Set<Integer> numbersGenerated = Set.of(1, 2, 3, 4, 5, 6);
        Set<Integer> userNumbersInputed = Set.of(9, 8);
        ConfigurationProvider configurationProvider = new LottoConfigurationLoaderTestImpl();
        WinningNumberGenerable numbersGenerator = new WinningNumbersGeneratorTestImpl(numbersGenerated);
        UserNumbersReading userNumbersInput = new UserNumbersReadingImp(userNumbersInputed);
        LottoGame lottoGame = new LottoGame(numbersGenerator, userNumbersInput);
        // when
        boolean result = lottoGame.start(configurationProvider);
        // then
        assertThat(result).isFalse();
    }

    @Disabled
    @Test
    public void should_return_failed_when_user_gave_duplicated_number() {
        // given
        Set<Integer> numbersGenerated = Set.of(1, 2, 3, 4, 5, 6);
        Set<Integer> userNumbersInputed = Set.of(9, 9, 8, 8, 7, 7);
        ConfigurationProvider configurationProvider = new LottoConfigurationLoaderTestImpl();
        WinningNumberGenerable numbersGenerator = new WinningNumbersGeneratorTestImpl(numbersGenerated);
        UserNumbersReading userNumbersInput = new UserNumbersReadingImp(userNumbersInputed);
        LottoGame lottoGame = new LottoGame(numbersGenerator, userNumbersInput);
        // when
        boolean result = lottoGame.start(configurationProvider);
        // then
        assertThat(result).isFalse();
    }

    @Test
    public void should_return_failed_when_user_gave_number_out_of_range() {
        // given
        Set<Integer> numbersGenerated = Set.of(1, 2, 3, 4, 5, 6);
        Set<Integer> userNumbersInputed = Set.of(15, 11, 24, 999, -7, 444);
        ConfigurationProvider configurationProvider = new LottoConfigurationLoaderTestImpl();
        WinningNumberGenerable numbersGenerator = new WinningNumbersGeneratorTestImpl(numbersGenerated);
        UserNumbersReading userNumbersInput = new UserNumbersReadingImp(userNumbersInputed);
        LottoGame lottoGame = new LottoGame(numbersGenerator, userNumbersInput);
        // when
        boolean result = lottoGame.start(configurationProvider);
        // then
        assertThat(result).isFalse();
    }
}
