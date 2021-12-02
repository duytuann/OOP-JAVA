import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces;

    /**
     * constructor board.
     */
    public Board() {
        this.pieces = new ArrayList<Piece>();
    }

    /**
     * addPiece.
     */
    public void addPiece(Piece piece) {
        if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())
                && this.getAt(piece.getCoordinatesX(), piece.getCoordinatesY()) == null) {
            pieces.add(piece);
        }
    }

    /**
     * validate.
     */
    public boolean validate(int x, int y) {
        return x >= 1 && x <= WIDTH && y >= 1 && y <= HEIGHT;
    }

    /**
     * removeAt.
     */
    public void removeAt(int x, int y) {
        Piece piece = getAt(x, y);
        if (piece != null) {
            pieces.remove(piece);
        }
    }

    /**
     * getAt.
     */
    public Piece getAt(int x, int y) {
        if (!pieces.isEmpty()) {
            for (Piece p : pieces) {
                if (p.getCoordinatesX() == x && p.getCoordinatesY() == y) {
                    return p;
                }
            }
        }
        return null;
    }

    /**
     * getPieces.
     */
    public ArrayList<Piece> getPieces() {
        return this.pieces;
    }

    /**
     * setPieces.
     */
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}