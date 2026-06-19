package controller;

import models.Game;
import models.Player;
import models.enums.GameState;
import strategy.WinningStrategy;

import java.util.List;

/**
 * Stateless orchestrator that acts as an interface between the Client (UI/Console)
 * and the Model (Game).
 * 
 * Design Decision:
 * Centralizing the game flow in a controller ensures that our Models remain pure 
 * and independent of how the input is gathered (Console, Web API, Mobile App).
 */
public class GameController {

    public Game startGame(int size,
                          List<Player> players,
                          List<WinningStrategy> winningStrategies) {
        return Game.getBuilder()
                .setSize(size)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void display(Game game) {
        game.getBoard().display();
    }

    public GameState getGameState(Game game) {
        return game.getGameState();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }
}
