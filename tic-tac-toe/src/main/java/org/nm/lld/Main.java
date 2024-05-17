package org.nm.lld;

import org.nm.lld.Models.Player;

public class Main {
    public static void main(String[] args) {
        TicTacToe ticTacToeGame = new TicTacToe();
        Player winner = ticTacToeGame.start();
        System.out.println("Winner is : " + winner);
    }
}
