import controller.GameController;
import models.*;
import models.enums.BotDifficulty;
import models.enums.GameState;
import strategy.ColWinningStrategy;
import strategy.RowWinningStrategy;
import strategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        int size = 3;
        List<Player> players = new ArrayList<>();
        players.add(new Human(1,"Goku",new Symbol("X","X"),20));
        //players.add(new Bot(2,"Goku",new Symbol("O","O"), BotDifficulty.EASY));
        players.add(new Human(3,"Kishore",new Symbol("C","C"),7));
        List<WinningStrategy> winningStrategies = List.of(new RowWinningStrategy(),
                new ColWinningStrategy());

        GameController gameController = new GameController();
        Game game = gameController.startGame(size,players,winningStrategies);

        // play
        while(gameController.getGameState(game).equals(GameState.IN_PROGRESS)) {
            gameController.display(game);
            gameController.makeMove(game);
            System.out.println("Do you want to UNDO");
            
        }

        gameController.display(game);

      if(gameController.getGameState(game).equals(GameState.DRAW)) {
          System.out.println("Game DRAWN");
      }
      else {
          // winning
          System.out.println("PLayer" +game.getWinner().getName()+ " has won");
      }

      // UNDO
    }
}
