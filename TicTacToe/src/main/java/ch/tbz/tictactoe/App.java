package main.java.ch.tbz.tictactoe;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe!");
        Board board = new Board();
        Player playerX = new HumanPlayer('X');
        Player playerO = new HumanPlayer('O');

        Game game = new Game(board, playerX, playerO);
        game.play();
    }
}
