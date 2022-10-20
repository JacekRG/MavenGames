package org.games;

import java.util.List;
import org.games.lotto.LottoGame;
import org.games.tictactoe.TicTacToeGame;

public class Application {
    public static void main(String[] args) {
        NumbersGenerator numbersGenerator = new NumbersGenerator();
        List<Playable> playables = List.of(
                new LottoGame(numbersGenerator),
                new TicTacToeGame()
        );

//
//        TicTacToe ticTacToe = new TicTacToe();
//        ticTacToe.start();
    }
}
