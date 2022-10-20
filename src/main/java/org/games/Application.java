package org.games;

import org.games.lotto.LottoConfiguration;
import org.games.lotto.LottoGame;
import org.games.lotto.NumbersGenerator;
import org.games.lotto.WinningNumberGenerable;

public class Application {
    public static void main(String[] args) {
        ConfigurationProvider lottoConfigurationLoader = new LottoConfigurationLoaderFromFile();
        LottoConfiguration configuration = lottoConfigurationLoader.loadConfiguration();
        WinningNumberGenerable numbersGenerator = new NumbersGenerator(configuration);
        LottoGame lottoGame = new LottoGame(numbersGenerator);
        lottoGame.start(lottoConfigurationLoader);
    }
}
