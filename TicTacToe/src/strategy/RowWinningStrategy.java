package strategy;

import models.Board;
import models.Move;
import models.Player;
import models.Symbol;

import java.util.HashMap;

/**
 * Checks for a win condition horizontally across a row.
 * 
 * Trade-offs (Time vs Memory):
 * We use a List of Maps (one map per row) to keep track of symbol frequencies.
 * This takes O(N) extra memory per row, but reduces the time complexity of checking 
 * a win from O(N) (scanning the whole row) down to O(1) (checking the map count).
 */
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
