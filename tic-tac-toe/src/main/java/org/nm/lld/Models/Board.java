package org.nm.lld.Models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final int size;
    private final Piece[][] board;

    public Board(int size) {
        this.size = size;
        board = new Piece[size][size];
    }

    public int getSize() {
        return size;
    }

    /**
     * Prints the board in human visualize-able form
     */
    public void printBoard() {
        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("   " + (board[i][j] != null ? board[i][j].pieceType : " ") + " |");
            }

            System.out.println();
        }

        System.out.println();
    }

    /**
     * Returns true if the space at given (row, col) is empty
     * @param row   row coordinate for the board
     * @param col   col coordinate for the board
     * @return      true if a piece is not already placed on the (row, col) coordinate
     */
    public boolean isSpaceEmpty(int row, int col) {
        return board[row][col] == null;
    }

    /**
     * Places the piece at given (row, col). Assumes the space is already empty.
     * @param row   row coordinate for the board
     * @param col   col coordinate for the board
     * @param piece piece to place on the board
     */
    public void setPieceAt(int row, int col, Piece piece) {
        board[row][col] = piece;
    }

    /**
     * Get the piece at given (row, col)
     * @param row   row coordinate for the board
     * @param col   col coordinate for the board
     * @return      returns the piece at given (row, col)
     */
    public Piece getPieceAt(int row, int col) {
        return board[row][col];
    }

    /**
     * Checks if any place on the empty, and a valid move can be made on the board at any place
     * @return  true if any space is null - ie. a piece can still be placed on the board
     */
    public boolean canMakeMove() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) return true;
            }
        }

        return false;
    }

}