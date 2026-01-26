package test.java.ch.tbz.tictactoe;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

class GameTest {

    private Game game;
    private Player playerX;
    private Player playerO;
    private Board board;

    @BeforeEach
    void setUp() {
        playerX = mock(Player.class);
        playerO = mock(Player.class);
        board = new Board();

        when(playerX.getMark()).thenReturn('X');
        when(playerO.getMark()).thenReturn('O');

        game = new Game(board, playerX, playerO);
    }

    @Test
    void testXWins() {
        when(playerX.makeMove(board)).thenReturn(new int[] { 0, 0 })
                .thenReturn(new int[] { 0, 1 })
                .thenReturn(new int[] { 0, 2 });

        when(playerO.makeMove(board)).thenReturn(new int[] { 1, 0 })
                .thenReturn(new int[] { 1, 1 });

        game.play();

        // Verify X wins logic (we might need a way to check result,
        // usually Game prints it, but we can check board state or if game loop ended)
        assertTrue(board.checkWin('X'));
        assertFalse(board.checkWin('O'));
    }

    @Test
    void testDraw() {
        /*
         * X O X
         * X O O
         * O X X
         */
        // Sequence of moves to fill the board
        when(playerX.makeMove(board)).thenReturn(new int[] { 0, 0 }, new int[] { 0, 2 }, new int[] { 1, 0 },
                new int[] { 2, 1 }, new int[] { 2, 2 });
        when(playerO.makeMove(board)).thenReturn(new int[] { 0, 1 }, new int[] { 1, 1 }, new int[] { 1, 2 },
                new int[] { 2, 0 });

        game.play();

        assertTrue(board.isFull());
        assertFalse(board.checkWin('X'));
        assertFalse(board.checkWin('O'));
    }
}
