import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory;

    /**
     * constructor and list.
     */
    public Game(Board board) {
        moveHistory = new ArrayList<Move>();
        this.board = board;
    }

    /**
     * getBoard.
     */
    public Board getBoard() {
        return this.board;
    }

    /**
     * setBoard.
     */
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * getMoveHistory.
     */
    public ArrayList<Move> getMoveHistory() {
        return this.moveHistory;
    }

    /**
     * movePiece.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece != null && board.validate(x, y) && piece.canMove(board, x, y)) {
            Piece kill = board.getAt(x, y);
            int preX = piece.getCoordinatesX();
            int preY = piece.getCoordinatesY();
            if (kill != null) {
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
                Move move = new Move(preX, preY, x, y, piece, kill);
                moveHistory.add(move);
                board.removeAt(x, y);
            } else {
                Move move = new Move(preX, preY, x, y, piece);
                moveHistory.add(move);
            }
        }
    }
} 