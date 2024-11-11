public class HumanPlayer extends Player {
    public HumanPlayer(boolean b) {
        super(isPlayerOne);
    }

    @Override
    boolean isHuman() {
        return true;
    }
}
