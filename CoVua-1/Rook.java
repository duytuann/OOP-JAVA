import java.lang.Math;

class Rook extends Piece {
    /**
     * Bishop.
     */
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y)) {
            return false;
        }
        if (x != getCoordinatesX() && y == getCoordinatesY()) {
            int a;
            int b;
            a = Math.max(x, getCoordinatesX());
            b = Math.min(x, getCoordinatesX());
            for (int i = b + 1; i < a; i++) {
                if (board.getAt(i, y) != null) {
                    return false;
                }
            }
            Piece temp = board.getAt(x, y);
            if (temp == null) {
                return true;
            } else {
                if (temp.getColor().equals(this.getColor())) {
                    return false;
                } else {
                    return true;
                }
            }
        } else if (x == getCoordinatesX() && y != getCoordinatesY()) {
            int a;
            int b;
            a = Math.max(y, getCoordinatesY());
            b = Math.min(y, getCoordinatesY());
            for (int i = b + 1; i < a; i++) {
                if (board.getAt(x, i) != null) {
                    return false;
                }
            }
            Piece temp = board.getAt(x, y);
            if (temp == null) {
                return true;
            } else {
                if (temp.getColor().equals(this.getColor())) {
                    return false;
                } else {
                    return true;
                }
            }
        } else {
            return false;
        }
    }
}