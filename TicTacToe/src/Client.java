import controller.GameController;
import models.*;
import models.enums.BotDifficulty;
import models.enums.GameState;
import strategy.ColWinningStrategy;
import strategy.RowWinningStrategy;
import strategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Main entry point simulating the User Interface.
 * 
 * Layman Explanation:
 * This acts as the "Frontend" of our application. It is very simple—it just defines 
 * the settings for the game (like Board Size and Players), asks the GameController 
 * to start, and then hands over control. 
 * We removed the "Game Loop" from here to keep the User Interface decoupled from 
 * the game's internal business logic (Model-View-Controller pattern).
 */
public class Client {

    // Removing Magic Numbers: We define our configurations clearly at the top.
    private static final int DEFAULT_BOARD_SIZE = 3;
    private static final int PLAYER_ONE_ID = 1;
    private static final int PLAYER_TWO_ID = 3;

    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();
        players.add(new Human(PLAYER_ONE_ID, "Goku", new Symbol("X", "X"), 20));
        //players.add(new Bot(2, "Bot", new Symbol("O", "O"), BotDifficulty.EASY));
        players.add(new Human(PLAYER_TWO_ID, "Kishore", new Symbol("C", "C"), 7));
        
        List<WinningStrategy> winningStrategies = List.of(
                new RowWinningStrategy(),
                new ColWinningStrategy()
        );

        GameController gameController = new GameController();
        
        // Step 1: Initialize the Game
        Game game = gameController.startGame(DEFAULT_BOARD_SIZE, players, winningStrategies);

        // Step 2: Hand over control to the GameController to run the game loop.
        gameController.runGameLoop(game);
    }
}
