package org.nm.lld.Models;

public class Player {

    private Piece piece;
    private String name;

    public Player(PieceType piecetype, String name) {
        this.piece = new Piece(piecetype);
        this.name = name;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player {" +
                " piece = " + piece +
                ", name = '" + name + '\'' +
                " } ";
    }
}
