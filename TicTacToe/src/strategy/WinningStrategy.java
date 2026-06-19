package strategy;

import models.Board;
import models.Move;
import models.Player;

/**
 * Interface defining the algorithm to check if a player has won.
 * 
 * Architecture Note (Strategy Pattern):
 * We use the Strategy pattern to encapsulate winning conditions. Instead of 
 * rigid if-else blocks checking every row, column, and diagonal, we iterate over
 * a list of WinningStrategies. If we want to add a new win condition (e.g., 
 * four corners), we just create a new class implementing this interface.
 */
public interface WinningStrategy {

    boolean checkWinner(Board board, Move move);
}
