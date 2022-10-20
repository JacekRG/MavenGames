package org.games.lotto;

import org.games.ConfigurationProvider;

public class LottoConfigurationLoaderTestImpl implements ConfigurationProvider {

    @Override
    public LottoConfiguration loadConfiguration() {
        return new LottoConfiguration(6, 99, 650000000);
    }
}
