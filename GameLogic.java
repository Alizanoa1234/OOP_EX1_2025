import javax.swing.text.Position;
import java.util.List;
import java.util.Stack;

public class GameLogic implements PlayableLogic {
    private Disc[][] board;
    private Player firstPlayer;
    private Player secondPlayer;
    private boolean firstPlayerTurn;
    private Stack<Move> history;

    public GameLogic(){
        board = new Disc[getBoardSize()][getBoardSize()];
        for (int i = 0; i < getBoardSize(); i++) {
            for (int j = 0; j < getBoardSize(); j++) {
                board[i][j] = null;
            }
        }
    }
    @Override
    public boolean locate_disc(Position a, Disc disc) {
        //if(a.isEmpty = true) // this pos is occupied
        if ((board[a.row()][a.col()] != null))
            return false;
        if (countFlips(a)== 0) //no discs are flippable
            return false;
        board[a.row()][a.col()] = disc;

        //    // הופכים את כל הדיסקים בעמדות שהוחזרו על ידי getFlippablePositions
        //    for (Position pos : flips) {
        //        board[pos.getX()][pos.getY()].flip();
        //    }
        //
        //    // שמירת המהלך במחסנית לצורך אפשרות של Undo
        //    moveHistory.push(new Move(a, disc));
        //
        //    // מעבר תור
        //    firstPlayerTurn = !firstPlayerTurn;
        //
        return true;
    }

    // Returns the disc and the type of disc at the current position
    @Override
    public Disc getDiscAtPosition(Position position) {
        if(board[position.row()][position.col()] == null)
            return isEmpty;

        if(board[position.row()][position.col()].getType() == "⭕")
            return new UnflippableDisc(board[position.row()][position.col()].getOwner());

        if(board[position.row()][position.col()].getType() == "bomdDisc");
        return new BombDisc(board[position.row()][position.col()].getOwner());

        return new SimpleDisc(board[position.row()][position.col()].getOwner());
    }
    //poistion = board[position.row()][position.col()]
    //        if(position == null)
    //            return isEmpty;
    //
    //        if(position.getType() == "⭕")
    //            return new UnflippableDisc(position.getOwner());
    //
    //        if(position.getType() == "bomdDisc");
    //        return new BombDisc(position.getOwner());
    //
    //        return new SimpleDisc(position.getOwner());
    //    }

    @Override
    public int getBoardSize() {
        return 8;
    }

    @Override
    public List<Position> ValidMoves() {
        return null;
    }

    @Override
    public int countFlips(Position a) {
        return 0;
    }

    @Override
    public Player getFirstPlayer() {
        return null;
    }

    @Override
    public Player getSecondPlayer() {
        return null;
    }

    @Override
    public void setPlayers(Player player1, Player player2) {

    }

    @Override
    public boolean isFirstPlayerTurn() {
        return false;
    }

    @Override
    public boolean isGameFinished() {
        return false;
    }

    @Override
    public void reset() {

    }

    @Override
    public void undoLastMove() {
        history.remove(history.getLast());
        gameborde=history.getLast();


    }
}