package ch.tbz.tictactoe;

public class Game {
    private final Board board;
    private final Player playerX;
    private final Player playerO;

    public Game(Board board, Player playerX, Player playerO) {
        this.board = board;
        this.playerX = playerX;
        this.playerO = playerO;
    }

    public void play() {
        Player currentPlayer = playerX;

        while (true) {
            board.print();
            int[] move = currentPlayer.makeMove(board);

            board.placeMark(move[0], move[1], currentPlayer.getMark());

            if (board.checkWin(currentPlayer.getMark())) {
                board.print();
                System.out.println("Player " + currentPlayer.getMark() + " wins!");
                break;
            }

            if (board.isFull()) {
                board.print();
                System.out.println("It's a draw!");
                break;
            }

            currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
        }
    }
}
