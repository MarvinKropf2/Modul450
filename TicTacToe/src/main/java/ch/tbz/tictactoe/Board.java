package ch.tbz.tictactoe;

public class Board {
    private char[][] cells;
    private static final int SIZE = 3;

    public Board() {
        cells = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                cells[i][j] = ' ';
            }
        }
    }

    public boolean isCellEmpty(int row, int col) {
        return cells[row][col] == ' ';
    }

    public char getCell(int row, int col) {
        return cells[row][col];
    }

    public boolean placeMark(int row, int col, char mark) {
        if (row >= 0 && row < SIZE && col >= 0 && col < SIZE && isCellEmpty(row, col)) {
            cells[row][col] = mark;
            return true;
        }
        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (cells[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWin(char mark) {
        for (int i = 0; i < SIZE; i++) {
            if ((cells[i][0] == mark && cells[i][1] == mark && cells[i][2] == mark) ||
                    (cells[0][i] == mark && cells[1][i] == mark && cells[2][i] == mark)) {
                return true;
            }
        }
        return (cells[0][0] == mark && cells[1][1] == mark && cells[2][2] == mark) ||
                (cells[0][2] == mark && cells[1][1] == mark && cells[2][0] == mark);
    }

    public void print() {
        System.out.println("-------------");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(cells[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}
