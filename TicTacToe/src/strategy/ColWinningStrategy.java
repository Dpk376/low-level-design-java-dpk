package strategy;

import models.Board;
import models.Move;
import models.Player;

import java.util.HashMap;

public class ColWinningStrategy implements WinningStrategy{
    private HashMap<String, Integer> colMaps[];

    public ColWinningStrategy() {
        this.colMaps = new HashMap[10000];
        for(int i=0;i<10000;i++) {
            colMaps[i] = new HashMap<>();
        }
    }

    @Override
    public boolean checkWinner(Board board, Move move) {
        // step 1: current player
        Player currPlayer = move.getPlayer();
        // get current row
        int currCol = move.getCell().getCol();

        HashMap<String,Integer> currColMap = colMaps[currCol];

        String currSymbol = currPlayer.getSymbol().getName();

        if(!currColMap.containsKey(currSymbol)) {
            currColMap.put(currSymbol,0);
        }
        currColMap.put(currSymbol,currColMap.get(currSymbol)+1);

        return currColMap.get(currSymbol)==board.getSize();
    }
}
