public class Bishop extends Piece {

    public Bishop(int x, int y) {
        super(x, y);
    }

    public Bishop(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (Math.abs(getCoordinatesX() - x) != Math.abs(getCoordinatesY() - y)) {
            return false;
        }
        int velocityX;
        int velocityY;
        if (getCoordinatesX() > x) {
            velocityX = -1;
        } else {
            velocityX = 1;
        }
        if (getCoordinatesY() > y) {
            velocityY = -1;
        } else {
            velocityY = 1;
        }
        for (int i = getCoordinatesX() + velocityX; i != x; i += velocityX) {
            for (int j = getCoordinatesY() + velocityY; j != y; j += velocityY) {
                Piece p = board.getAt(i, j);
                if (p != null) {
                    return false;
                }
            }
        }
        Piece p = board.getAt(x, y);
        if (p == null) {
            return true;
        }
        if (getColor().equals(p.getColor())) {
            return false;
        }
        return true;
    }
}