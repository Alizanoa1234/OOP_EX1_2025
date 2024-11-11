import javax.swing.text.Position;
import java.util.List;
import java.util.Stack;

public class GameLogic implements PlayableLogic {
    private Disc[][] board;
    private Player firstPlayer;
    private Player secondPlayer;
    private boolean firstPlayerTurn;
    private Stack<Move> history;

    // private Position [][] gameborde;
    //private List<Position[][]> history ;
    @Override
    public boolean locate_disc(Position a, Disc disc) {
        if(board[a.getX][a.getY] != null) // this pos is occupied
            return false;
        if(countFlips(a)== 0) //no discs are flippable
            return false;
        return true;
        //// הנחת הדיסק בעמדה הנתונה
        //    board[a.getX()][a.getY()] = disc;
        //
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
        //    return true; // מהלך חוקי, הדיסק הונח והמשחק ממשיך mj
    }

    @Override
    public Disc getDiscAtPosition(Position position) {
        return null;
    }

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