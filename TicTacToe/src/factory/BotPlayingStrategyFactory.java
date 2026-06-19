package factory;

import models.enums.BotDifficulty;
import strategy.BotPlayingStrategy;
import strategy.EasyPlayingStrategy;
import strategy.HardPlayingStrategy;
import strategy.MediumPlayingStrategy;

/**
 * Factory class responsible for instantiating the correct BotPlayingStrategy.
 * 
 * Design Decision:
 * By abstracting the instantiation of BotPlayingStrategy based on BotDifficulty,
 * we adhere to the Simple Factory pattern. This hides the complexity of object
 * creation from the client and ensures that we only instantiate the specific 
 * strategy algorithm required at runtime.
 */
public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getPlayingStrategy(BotDifficulty botDifficulty) {
        if(botDifficulty.equals(BotDifficulty.EASY)) {
            return new EasyPlayingStrategy();
        }
        else if(botDifficulty.equals(BotDifficulty.MEDIUM)) {
            return new MediumPlayingStrategy();
        }
        else return new HardPlayingStrategy();
    }
}
