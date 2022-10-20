package org.games.lotto;

import java.util.Set;
import org.games.ConfigurationProvider;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LottoGameTest {

    @Test
    public void should_return_success_when_user_gave_six_numbers() {
        // given
        ConfigurationProvider configurationProvider = new LottoConfigurationLoaderTestImpl();
        Set<Integer> numbersGenerated = Set.of(1, 2, 3, 4, 5, 6);
        WinningNumberGenerable numbersGenerator = new WinningNumbersGeneratorTestImpl(numbersGenerated);
        LottoGame lottoGame = new LottoGame(numbersGenerator);
        // when
        boolean result = lottoGame.start(configurationProvider);
        // then
        assertThat(result).isTrue();
    }

    @Test
    public void should_return_failed_when_user_gave_less_than_six_numbers() {
    }
    @Test
    public void should_return_failed_when_user_gave_more_than_six_numbers() {
    }
    @Test
    public void should_return_failed_when_user_gave_duplicated_number() {
    }
    @Test
    public void should_return_failed_when_user_gave_number_out_of_range() {
    }
}
