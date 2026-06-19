package models;

import factory.BotPlayingStrategyFactory;
import models.enums.BotDifficulty;
import models.enums.PlayerType;
import strategy.BotPlayingStrategy;

/**
 * Represents an AI player.
 * 
 * Architecture Note (Strategy Pattern):
 * The Bot does not contain the logic for "how" to play. Instead, it delegates to a 
 * BotPlayingStrategy. This allows us to dynamically change a bot's difficulty level 
 * without modifying the Bot class itself (Open/Closed Principle).
 */
public class Bot extends Player{
    private BotDifficulty botDifficulty;
    private BotPlayingStrategy playingStrategy;

    public Bot(int id,
               String name,
               Symbol symbol,
               BotDifficulty botDifficulty) {
        super(id, name, symbol, PlayerType.BOT);
        this.botDifficulty = botDifficulty;
        this.playingStrategy = BotPlayingStrategyFactory.getPlayingStrategy(botDifficulty);
    }

    public BotDifficulty getBotDifficulty() {
        return botDifficulty;
    }

    public void setBotDifficulty(BotDifficulty botDifficulty) {
        this.botDifficulty = botDifficulty;
    }

    public BotPlayingStrategy getPlayingStrategy() {
        return playingStrategy;
    }

    public void setPlayingStrategy(BotPlayingStrategy playingStrategy) {
        this.playingStrategy = playingStrategy;
    }

    @Override
    public Move makeMove(Game game) {
        System.out.println("It's "+this.getName()+" bot's turn");
        Move move = playingStrategy.makeMove(game.getBoard());
        move.setPlayer(this);
        return move;
    }
}
