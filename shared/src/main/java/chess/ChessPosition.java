package chess;

/**
 * Represents a single square position on a chess board
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPosition {
    /* these are fields that ensure each time an instance of this class is made, the row and column number is final
    and cannot be changed.
     */
    private final int row;
    private final int col;

    /* This is a constructor that makes sure that each instance gets its own unique position (row and column) by
    using the "this." notation.
     */
    public ChessPosition(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * @return which row this position is in
     * 1 codes for the bottom row
     */

    // This simply returns the row variable for the specific object instance in use.
    public int getRow() {
        return row;
    }

    /**
     * @return which column this position is in
     * 1 codes for the left row
     */
    // This simply returns the col variable for the specific object instance in use.
    public int getColumn() {
        return col;
    }
}
