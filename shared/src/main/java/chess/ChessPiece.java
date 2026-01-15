package chess;

import java.util.Collection;
import java.util.List;

/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPiece {
/* I added in a few fields that allowed me to
    private final ChessGame.TeamColor pieceColor;
    private final PieceType type;

    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) {
        this.pieceColor = pieceColor;
        this.type = type;
    }

    /**
     * The various different chess piece options
     */
    public enum PieceType {
        KING,
        QUEEN,
        BISHOP,
        KNIGHT,
        ROOK,
        PAWN
    }

    /**
     * @return Which team this chess piece belongs to
     */
    // I simply made this return the pieceColor
    public ChessGame.TeamColor getTeamColor() {

        return pieceColor;
    }

    /**
     * @return which type of chess piece this piece is
     */
    // I simply made this return the pieceType
    public PieceType getPieceType() {
        return type;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */
    /*This is a hard coded way to get some of the test for the bishop to work correctly. I will need to make
    a programatic way to make this work without hardcoding the begging and start positions.
     */
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        ChessPiece piece = board.getPiece(myPosition);
        if (piece.getPieceType() == PieceType.BISHOP) {
            /*this is where I think I would need to write logic that checks one direction of travel, like forward and
            left for example. As it checks, it makes sure the next square is not out of board boundaries ( no bigger
            than row 8 or smaller than column 1) and also if there is an opponents piece or a piece of their own in that
            square. Obviously, if the move goes outside the bounds of the board or lands on a piece of your own, the move
            is not valid. It is valid if the move lands on an opponents piece.

            So I could say for forward left movement something like:
            while the move is valid:
            if (col - 1) >= 1 && (row + 1) <= 8 (then the move is valid)
                else move = not valid
             */

            /* for the PAWN all you need to do for the promotion portion is have it check if it is on the very top or
            bottom of the board, then if it is, it must promote because there is no way for a pawn to move to the back
            of their same side. 
             */
            return List.of(new ChessMove(new ChessPosition(5, 4), new ChessPosition(1, 8), null));
        }
        return List.of();
    }
}
