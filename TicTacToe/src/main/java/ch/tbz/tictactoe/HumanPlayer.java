package ch.tbz.tictactoe;

import java.util.Scanner;

public class HumanPlayer implements Player {
    private final char mark;
    private final Scanner scanner;

    public HumanPlayer(char mark) {
        this.mark = mark;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public char getMark() {
        return mark;
    }

    @Override
    public int[] makeMove(Board board) {
        int row, col;
        while (true) {
            System.out.println("Player " + mark + ", enter row (0-2) and column (0-2): ");
            try {
                if (scanner.hasNextInt()) {
                    row = scanner.nextInt();
                    if (scanner.hasNextInt()) {
                        col = scanner.nextInt();
                    } else {
                        scanner.next();
                        continue;
                    }
                } else {
                    scanner.next();
                    continue;
                }

                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board.isCellEmpty(row, col)) {
                    return new int[] { row, col };
                } else {
                    System.out.println("Invalid move, try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter numbers.");
                scanner.nextLine();
            }
        }
    }
}
