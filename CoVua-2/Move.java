public class Move {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private Piece movedPiece;
    private Piece killedPiece;

    /**
     * constructor 5 params.
     */
    public Move(int startX, int startY, int endX, int endY, Piece movedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }

    /**
     * constructor 6 params.
     */
    public Move(int startX, int startY, int endX, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    @Override
    public String toString() {
        String res = movedPiece.getColor() + "-" + movedPiece.getSymbol();
        res = res + (char) ('a' + endX - 1) + endY;
        return res;
    }

    /**
     * getStartX.
     */
    public int getStartX() {
        return startX;
    }

    /**
     * setStartX.
     */
    public void setStartX(int startX) {
        this.startX = startX;
    }

    /**
     * getStartY.
     */
    public int getStartY() {
        return startY;
    }

    /**
     * setStartY.
     */
    public void setStartY(int startY) {
        this.startY = startY;
    }

    /**
     * getEndX.
     */
    public int getEndX() {
        return endX;
    }

    /**
     * setEndX.
     */
    public void setEndX(int endX) {
        this.endX = endX;
    }

    /**
     * getEndY.
     */
    public int getEndY() {
        return endY;
    }

    /**
     * setEndY.
     */
    public void setEndY(int endY) {
        this.endY = endY;
    }

    /**
     * getMovedPiece.
     */
    public Piece getMovedPiece() {
        return movedPiece;
    }

    /**
     * setMovedPiece.
     */
    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    /**
     * getKilledPiece.
     */
    public Piece getKilledPiece() {
        return killedPiece;
    }

    /**
     * setKilledPiece.
     */
    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }
}