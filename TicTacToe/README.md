# TicTacToe - Low Level Design (LLD)

This repository contains a production-grade, extensible implementation of the classic TicTacToe game in Java. It is designed to demonstrate advanced Object-Oriented Design principles and design patterns commonly evaluated in technical interviews and used in enterprise software.

## Layman Explanation: How the Game Works

At its core, TicTacToe is a turn-based game played on an `N x N` grid (typically 3x3).
1. **Setup**: The game starts by taking the board size and a list of players. If the board is `N x N`, there must be exactly `N - 1` players. Players can be Human or a Bot.
2. **Gameplay**: Players take turns placing their unique symbol (e.g., 'X' or 'O') on an empty cell.
3. **Winning**: After every move, the system checks if the current player has filled an entire row, column, or diagonal with their symbol. If they have, they win.
4. **Drawing**: If all cells are filled and no one has won, the game ends in a draw.
5. **Undo**: A player can undo the last move, which removes the symbol from the board and reverts the turn to the previous player.

## Architecture & Design Patterns

To make the code maintainable, extensible, and robust, we have utilized several design patterns.

### 1. Builder Pattern (`Game.Builder`)
**Where it's used:** Creating the `Game` object.
**Why we chose it:** A `Game` requires a complex setup—validating the board dimension against the number of players, ensuring all players have unique symbols, and initializing the grid. A constructor with too many arguments is prone to errors. The Builder pattern allows us to validate the state *before* the object is created, guaranteeing that once a `Game` object exists, it is in a valid state.

### 2. Strategy Pattern
**Where it's used:** Determining the winning conditions (`WinningStrategy`) and Bot behaviors (`BotPlayingStrategy`).
**Why we chose it:** 
- **Winning Logic:** Hardcoding `if-else` loops for rows, columns, and diagonals makes the code rigid. By abstracting the win-check into a `WinningStrategy` interface (`RowWinningStrategy`, `ColWinningStrategy`), we can easily add new rules (e.g., winning by four corners) without touching the core game loop. This adheres to the **Open/Closed Principle**.
- **Bot Behavior:** A Bot can play Easy, Medium, or Hard. Instead of putting this logic in the Bot class, we inject a `BotPlayingStrategy`. This allows us to hot-swap bot intelligence algorithms independently of the Bot entity.

### 3. Factory Pattern
**Where it's used:** Instantiating the `Game` and the `BotPlayingStrategy`.
**Why we chose it:** The client shouldn't need to know *how* an Easy Bot differs structurally from a Hard Bot. The `BotPlayingStrategyFactory` centralizes the creation logic, taking an enum (`BotDifficulty`) and returning the correct algorithm implementation.

## Trade-offs & Design Decisions

### Fast Win Checking vs. Memory Usage
- **Decision:** The `WinningStrategy` implementations use HashMaps to track the frequency of symbols in every row and column.
- **Trade-off:** This requires `O(N)` additional memory per row/column. However, it drops the time complexity of checking a win after a move from `O(N)` (iterating over the whole row/column to check for a match) to `O(1)`. In a game engine where performance on every turn is critical, trading a small amount of memory for speed is optimal.

### State Tracking for "Undo" vs. Simplicity
- **Decision:** We maintain a `List<Move>` inside the `Game` class to track the history of the game.
- **Trade-off:** Storing history requires extra memory `O(N^2)`. However, it allows for a highly efficient `undo()` operation. Instead of trying to calculate what the previous state was, we simply pop the last `Move` off the stack, clear the associated `Cell`, and update our `WinningStrategy` HashMaps in `O(1)` time. 

### Separation of Concerns (MVC-like)
- **Decision:** The `GameController` acts as a stateless intermediary between the `Client` (UI/Console) and the `Game` (Model).
- **Trade-off:** It adds a slight layer of boilerplate code. But it ensures that if we ever want to move this game from a Console App to a Spring Boot REST API or an Android App, the `Game` model remains completely untouched. The controller handles the specific input/output formatting.

## Google Engineering Standards Applied
- **Immutability where possible**: Core dependencies and configurations are final.
- **Fail-Fast**: The `Game.Builder` throws specific exceptions immediately upon detecting invalid parameters (like `InvalidPlayerCountException`).
- **Descriptive Naming**: No magic numbers or ambiguous variable names (`x` or `y` are avoided in favor of `row` and `col`).

