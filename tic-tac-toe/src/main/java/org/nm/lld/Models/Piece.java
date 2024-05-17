package org.nm.lld.Models;

public class Piece {

    PieceType pieceType;

    public Piece(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    @Override
    public String toString() {
        return "Piece {" +
                " pieceType = " + pieceType +
                " } ";
    }
}
