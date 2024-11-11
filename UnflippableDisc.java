public class UnflippableDisc implements Disc {
    Player currentOwner;
    public UnflippableDisc(Player currentOwner) {
        this.currentOwner = currentOwner;
    }

    @Override
    public Player getOwner() {
        return currentOwner;
    }

    @Override
    public void setOwner(Player player) {
    currentOwner = player;
    }

    @Override
    public String getType() {
        return "⭕";
    }
}
