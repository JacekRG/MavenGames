package org.games.tictactoe;

import org.games.NumbersGenerator;
import org.games.Playable;

public class TicTacToeGame implements Playable {

    @Override
    public boolean start() {
        System.out.println("playing tic tac toe");
        return false;
    }
}
