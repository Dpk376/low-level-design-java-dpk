package models;

/**
 * Represents a single action taken by a Player.
 * 
 * Design Decision:
 * Storing both the Player and the Cell in a Move object allows us to implement 
 * the 'Undo' feature efficiently. We can simply pop the last Move from the history
 * stack and revert the exact Cell back to EMPTY.
 */
public class Move {

    private Player player;
    private Cell cell;

    public Move(Player player, Cell cell) {
        this.player = player;
        this.cell = cell;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
