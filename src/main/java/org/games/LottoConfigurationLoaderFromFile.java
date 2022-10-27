package org.games;

import org.games.lotto.LottoConfiguration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class LottoConfigurationLoaderFromFile implements ConfigurationProvider {

    private static final String PATH = "./lottoConfig.txt";
    private ArrayList<Integer> lottoConfigParams;
    Scanner scanner;

    @Override
    public LottoConfiguration loadConfiguration() {

        try {
            scanner = new Scanner(new File(PATH));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        lottoConfigParams = new ArrayList<Integer>();
        while (scanner.hasNextLine()) {
            lottoConfigParams.add(scanner.nextInt());
        }
        scanner.close();
        return new LottoConfiguration(lottoConfigParams.get(0), lottoConfigParams.get(1), lottoConfigParams.get(2));
    }
}
