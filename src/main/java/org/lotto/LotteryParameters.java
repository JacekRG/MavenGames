package org.lotto;

public class LotteryParameters {
    private static int lotterySize = 6;
    private static int numbersRange = 99;
    private static int cashPrize = 650000000;

    public static int getLotterySize() {
        return lotterySize;
    }

    public static void setLotterySize(int lotterySize) {
        LotteryParameters.lotterySize = lotterySize;
    }

    public static int getNumbersRange() {
        return numbersRange;
    }

    public static void setNumbersRange(int numbersRange) {
        LotteryParameters.numbersRange = numbersRange;
    }

    public static int getCashPrize() {
        return cashPrize;
    }

    public static void setCashPrize(int cashPrize) {
        LotteryParameters.cashPrize = cashPrize;
    }


}
