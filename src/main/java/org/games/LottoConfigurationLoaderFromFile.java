package org.games;

import org.games.lotto.LottoConfiguration;

public class LottoConfigurationLoaderFromFile implements ConfigurationProvider {
    @Override
    public LottoConfiguration loadConfiguration() {
        // reading from file
        return new LottoConfiguration(6, 99, 650000000);
    }
}
