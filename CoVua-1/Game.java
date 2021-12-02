import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory = new ArrayList<Move>();

    public Game(Board board) {
        this.board = board;
    }

    /**
     * movePiece.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece != null && piece.canMove(board, x, y)) {
            Move moving = new Move(piece.getCoordinatesX(), x, piece.getCoordinatesY(), y, piece);
            if (board.getAt(x, y) != null 
                    && !board.getAt(x, y).getColor().equals(piece.getColor())) {
                moving.setKilledPiece(board.getAt(x, y));
                board.removeAt(x, y);
            }
            moveHistory.add(moving);
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * getMoveHistory.
     */
    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }
}