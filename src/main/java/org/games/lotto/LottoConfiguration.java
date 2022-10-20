package org.games.lotto;

public class LottoConfiguration {
    private final int lotterySize;
    private final int numbersRange;
    private final int cashPrize;

    public LottoConfiguration(int lotterySize, int numbersRange, int cashPrize) {
        this.lotterySize = lotterySize;
        this.numbersRange = numbersRange;
        this.cashPrize = cashPrize;
    }

    public int getLotterySize() {
        return lotterySize;
    }

    public int getNumbersRange() {
        return numbersRange;
    }

    public int getCashPrize() {
        return cashPrize;
    }
}
