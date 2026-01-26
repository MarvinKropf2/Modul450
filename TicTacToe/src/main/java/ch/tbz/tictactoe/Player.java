package ch.tbz.tictactoe;

public interface Player {
    int[] makeMove(Board board);

    char getMark();
}
