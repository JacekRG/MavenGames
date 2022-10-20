package org.games;


import org.games.lotto.LottoConfiguration;

public interface ConfigurationProvider {

    LottoConfiguration loadConfiguration();
}
