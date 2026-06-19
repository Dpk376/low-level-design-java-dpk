package controller;

import models.Game;
import models.Player;
import models.enums.GameState;
import strategy.WinningStrategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;
import java.util.List;

/**
 * Stateless orchestrator that acts as an interface between the Client (UI/Console)
 * and the Model (Game).
 * 
 * Design Decision:
 * Centralizing the game flow in a controller ensures that our Models remain pure 
 * and independent of how the input is gathered (Console, Web API, Mobile App).
 * 
 * Layman Explanation:
 * Think of the GameController as the Referee. The referee starts the game, tells
 * the players whose turn it is, displays the board, and announces the winner.
 * The players (Models) don't have to worry about the sequence of events; the 
 * referee manages it.
 */
public class GameController {
    private static final Logger log = LoggerFactory.getLogger(GameController.class);

    public Game startGame(int size,
                          List<Player> players,
                          List<WinningStrategy> winningStrategies) {
        log.info("Starting a new game with board size: {}", size);
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

    /**
     * Layman Explanation:
     * This is the "Game Loop". As long as the game is IN_PROGRESS, we keep asking
     * players to make moves. We also ask if they want to undo their last move.
     * When the loop ends, we announce the result (Win or Draw).
     */
    public void runGameLoop(Game game) {
        Scanner scanner = new Scanner(System.in);
        log.info("Entering the main game loop.");

        while(getGameState(game).equals(GameState.IN_PROGRESS)) {
            display(game);
            
            // Allow user to Undo
            System.out.println("Do you want to UNDO your last move? (y/n)");
            String undoAnswer = scanner.nextLine();
            if(undoAnswer.equalsIgnoreCase("y")) {
                // TODO: game.undo(); 
                System.out.println("Undo feature is not fully implemented yet.");
                log.info("User requested an UNDO.");
                continue;
            }

            makeMove(game);
        }

        log.info("Game has ended. State: {}", getGameState(game));
        display(game);

        if(getGameState(game).equals(GameState.DRAW)) {
            System.out.println("Game DRAWN");
        } else {
            System.out.println("Player " + game.getWinner().getName() + " has won!");
        }
    }
}
