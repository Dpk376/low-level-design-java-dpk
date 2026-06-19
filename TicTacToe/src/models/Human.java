package models;

import models.enums.PlayerType;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Represents a real-world user interacting via the console or UI.
 * 
 * Layman Explanation:
 * This class handles reading input from a human player. Real humans make mistakes—they
 * might type a letter when we ask for a number, or pick a row that doesn't exist.
 * Therefore, this class must have robust "Validation" and "Exception Handling" to 
 * prevent the game from crashing when bad input is provided.
 */
public class Human extends Player {
    private static final Logger log = LoggerFactory.getLogger(Human.class);
    private int age;
    private Scanner scanner = new Scanner(System.in);

    public Human(int id,
                 String name,
                 Symbol symbol,
                 int age) {
        super(id, name, symbol, PlayerType.HUMAN);
        this.age = age;
    }

    /**
     * Layman Explanation:
     * This method runs in a loop (`while(true)`) so that if the user makes a mistake,
     * we don't crash. Instead, we catch the error, scold them gently, and ask them 
     * to try again.
     */
    @Override
    public Move makeMove(Game game) {
        while (true) {
            try {
                System.out.println("Please enter row and column to make a move (0 to " + (game.getBoard().getSize() - 1) + "):");
                int row = scanner.nextInt();
                int col = scanner.nextInt();

                if (validateMove(game, row, col)) {
                    return new Move(this, new Cell(row, col));
                }
            } catch (InputMismatchException e) {
                // We use SLF4J logger to log warnings (Enterprise standard) instead of System.out
                log.warn("User entered a non-integer value.");
                System.out.println("Invalid input type! Please enter numbers only.");
                scanner.nextLine(); // Clear the bad input from the scanner buffer
            }
        }
    }

    /**
     * Validates if the chosen row and column are within the board boundaries and 
     * the cell is not already filled.
     */
    private boolean validateMove(Game game, int row, int col) {
        int size = game.getBoard().getSize();
        if (row < 0 || row >= size || col < 0 || col >= size) {
            System.out.println("Move out of bounds! The board size is " + size + "x" + size + ". Try again.");
            return false;
        }

        if (game.getBoard().getCells().get(row).get(col).getCellState() == models.enums.CellState.FILLED) {
            System.out.println("That cell is already filled! Pick an empty spot.");
            return false;
        }

        return true;
    }
}
