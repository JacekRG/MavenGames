package org.games;

import org.games.lotto.*;

public class Application {
    public static void main(String[] args) {
        ConfigurationProvider lottoConfigurationLoader = new LottoConfigurationLoaderFromFile();
        LottoConfiguration configuration = lottoConfigurationLoader.loadConfiguration();
        WinningNumberGenerable numbersGenerator = new NumbersGenerator(configuration);
        UserNumbersReading userInput = new UserInput(configuration);
        LottoGame lottoGame = new LottoGame(numbersGenerator, userInput);
        lottoGame.start(lottoConfigurationLoader);
    }
}
