package strategy;

import models.Board;
import models.Move;
import models.Player;
import models.Symbol;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy{

    private HashMap<String, Integer> rowMaps[];

    public RowWinningStrategy() {
        this.rowMaps = new HashMap[10000];
        for(int i=0;i<10000;i++) {
            rowMaps[i] = new HashMap<>();
        }
    }

    @Override
    public boolean checkWinner(Board board, Move move) {
        // step 1: current player
        Player currPlayer = move.getPlayer();
        // get current row
        int currRow = move.getCell().getRow();

        HashMap<String,Integer> currRowMap = rowMaps[currRow];

        String currSymbol = currPlayer.getSymbol().getName();

        if(!currRowMap.containsKey(currSymbol)) {
            currRowMap.put(currSymbol,0);
        }
        currRowMap.put(currSymbol,currRowMap.get(currSymbol)+1);

        return currRowMap.get(currSymbol)==board.getSize();
    }
}
