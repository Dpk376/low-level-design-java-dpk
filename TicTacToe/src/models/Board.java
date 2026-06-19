package models;

import models.enums.CellState;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the NxN playing grid for the game.
 * 
 * Design Decision:
 * We use a 2D List of Cells rather than a primitive 2D array. While an array is more 
 * memory-efficient, a List provides better integration with Java's Collections framework
 * and allows for more flexible operations if the board size were to change dynamically.
 */
public class Board {

    private int size;
    private List<List<Cell>> cells;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getCells() {
        return cells;
    }

    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }

    public Board(int size) {
        this.size = size;

        this.cells = new ArrayList<>();
        for(int i=0;i<size;i++) {
            this.cells.add(new ArrayList<>());
            for (int j = 0; j < size; j++) {
                this.cells.get(i).add(new Cell(i,j));
            }
        }
    }

    public void display() {
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                this.cells.get(i).get(j).display();
            }
            System.out.println();
        }
    }
}
