package factory;

import exceptions.InvalidPlayerCountException;
import models.Game;
import models.Player;

import java.util.List;

/**
 * Factory for creating Game instances.
 * <p>
 * Design Decision:
 * We use a factory (or Builder pattern directly within the Game class) 
 * to encapsulate the instantiation logic and validations. This ensures
 * that invalid game configurations cannot be created, promoting fail-fast behavior.
 */
public class GameFactory {
    public static Game createGame(int dimension, List<Player> players) throws InvalidPlayerCountException {
        // Validations
        if (players.size() != dimension - 1) {
            throw new InvalidPlayerCountException("Player count should be " + (dimension - 1));
        }

        // Assuming Game has a builder for robust creation
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .build();
    }
}