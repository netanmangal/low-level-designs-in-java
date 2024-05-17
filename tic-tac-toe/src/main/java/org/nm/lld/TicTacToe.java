package org.nm.lld;

import org.nm.lld.Models.Board;
import org.nm.lld.Models.Piece;
import org.nm.lld.Models.PieceType;
import org.nm.lld.Models.Player;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToe {

    private Board board;
    private final Deque<Player> players = new LinkedList<Player>();;

    public TicTacToe() {
        initialize();;
    }

    /**
     * Initializes the board
     * - with 2 players
     * - board of size 3*3
     */
    public void initialize() {
        players.add(new Player(PieceType.X, "1"));
        players.add(new Player(PieceType.O, "2"));

        board = new Board(3);

        System.out.println("2 players added : " + players);
        board.printBoard();
    }

    /**
     * Starts the game. Responsible for
     * - checking if a valid move can be made
     * - takes input from the user
     * - places the piece
     * - checks for the winner
     * @return winner of the game. If game is a tie, it returns null.
     */
    public Player start() {
        Player winner = null;
        Scanner scanner = new Scanner(System.in);

        while (winner == null) {
            if (!board.canMakeMove()) {
                System.out.println("Board is full. It's a TIE.");
                return null;
            }

            Player playerToMakeMove = players.removeFirst();
            System.out.println("Turn of player : " + playerToMakeMove.getName());

            // read from the input - row & column
            System.out.print("Enter you inputs \"row,col\" : ");
            String input = scanner.nextLine();
            String[] entry = input.split(",");
            if (entry.length != 2) {
                System.out.println("Invalid input - row & col not specified. Try again.");
                players.addFirst(playerToMakeMove);
                continue;
            }

            // check for bounds
            int row = Integer.parseInt(entry[0]), col = Integer.parseInt(entry[1]);
            if (row >= board.getSize() || col >= board.getSize()) {
                System.out.println("Invalid input - out of bounds. Try again.");
                players.addFirst(playerToMakeMove);
                continue;
            }

            boolean moveAcknowledged = makeAMove(playerToMakeMove, row, col);
            if (!moveAcknowledged) {
                players.addFirst(playerToMakeMove);
                continue;
            }

            board.printBoard();
            winner = checkWinner(playerToMakeMove, row, col);
            players.addLast(playerToMakeMove);
        }

        return winner;
    }

    /**
     * Makes the move
     * @param player    Player making the move
     * @param row       row coordinate for the board
     * @param col       col coordinate for the board
     * @return          if move was made successfully
     */
    public boolean makeAMove(Player player, int row, int col) {
        if (board.isSpaceEmpty(row, col)) {
            board.setPieceAt(row, col, player.getPiece());
            return true;
        } else {
            System.out.println("Can't place the move here. Try again.");
            return false;
        }
    }

    /**
     * Checks the winner, after a player has made a move
     * @param player    Player who has
     * @param row       row coordinate for the board
     * @param col       col coordinate for the board
     * @return          winner player, if no one has won yet, it returns null
     */
    private Player checkWinner(Player player, int row, int col) {
        Piece playerPiece = player.getPiece();
        int boardSize = board.getSize();

        boolean isWinner = true;

        // row winner
        for (int i = 0; i < boardSize; i++) {
            if (board.getPieceAt(row, i) != playerPiece) {
                isWinner = false;
            }
        }
        if (isWinner) return player;

        // column winner
        isWinner = true;
        for(int i = 0; i < boardSize; i++) {
            if (board.getPieceAt(i, col) != playerPiece) {
                isWinner = false;
            }
        }
        if (isWinner) return player;

        // top-left - bottom-right diagonal winner
        isWinner = true;
        for (int i = 0, j = 0; i < boardSize; i++, j++) {
            if (board.getPieceAt(i, j) != playerPiece) {
                isWinner = false;
            }
        }
        if (isWinner) return player;

        // top-right - bottom-left diagonal winner
        isWinner = true;
        for (int i = 0, j = boardSize - 1; i < boardSize; i++, j--) {
            if (board.getPieceAt(i, j) != playerPiece) {
                isWinner = false;
            }
        }
        if (isWinner) return player;

        return null;
    }

}
