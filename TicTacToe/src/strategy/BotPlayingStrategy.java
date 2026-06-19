package strategy;

import models.Board;
import models.Move;

/**
 * Strategy interface defining how a Bot calculates its next move.
 */
public interface BotPlayingStrategy {

    Move makeMove(Board board);
}
