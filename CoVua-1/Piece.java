public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color = "white";

    /**
     * constructor 2 params.
     */
    public Piece(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }

    /**
     * constructor 3 params.
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        if (!(color.equals("white") || color.equals("black"))) {
            throw new IllegalArgumentException("color must be white or black");
        }
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    /**
     * canMove.
     */
    public abstract boolean canMove(Board board, int x, int y);

    /**
     * getSymbol.
     */
    public abstract String getSymbol();

    /**
     * checkPosition.
     */
    public boolean checkPosition(Piece other) {
        return coordinatesX == other.getCoordinatesX() && coordinatesY == other.getCoordinatesY();
    }

    /**
     * getCoordinatesX.
     */
    public int getCoordinatesX() {
        return coordinatesX;
    }

    /**
     * setCoordinatesX.
     */
    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    /**
     * getCoordinatesY.
     */
    public int getCoordinatesY() {
        return coordinatesY;
    }

    /**
     * setCoordinatesY.
     */
    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    /**
     * getColor.
     */
    public String getColor() {
        return color;
    }

    /**
     * setColor.
     */
    public void setColor(String color) {
        this.color = color;
    }

}