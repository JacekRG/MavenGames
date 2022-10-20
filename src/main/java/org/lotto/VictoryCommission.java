package org.lotto;

public class VictoryCommission {
    NumbersGenerator dailyLuckyNumbers = new NumbersGenerator();
    UserInput userInput = new UserInput();

    public void winnerChoosing() {
        if (dailyLuckyNumbers.generateNumbers().equals(userInput.typing())) {
            System.out.println("Lucky numbers today: " + dailyLuckyNumbers.luckyNumbers);
            System.out.println("You won $ " + LotteryParameters.getCashPrize());
        } else
            System.out.println("Lucky numbers today: " + dailyLuckyNumbers.luckyNumbers
                    + "\n Your types: " + userInput.typedNumbers + "\n You are the loser XXD");
    }
}
