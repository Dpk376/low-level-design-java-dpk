package strategy;

import models.Board;
import models.Cell;
import models.Move;
import models.enums.CellState;

public class EasyPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board) {
        for(int row=0;row<board.getSize();row++) {
            for(int col=0;col<board.getSize();col++) {
                if(board.getCells().get(row).get(col).getCellState().equals(CellState.EMPTY)) {
                    return new Move(null,new Cell(row,col));
                }
            }
        }
        return null;
    }
}
