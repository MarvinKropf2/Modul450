package test.java.ch.tbz.tictactoe;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {

    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
    }

    @Test
    void testBoardInitialization() {
        assertTrue(board.isCellEmpty(0, 0));
        assertTrue(board.isCellEmpty(2, 2));
    }

    @Test
    void testPlaceMark() {
        assertTrue(board.placeMark(0, 0, 'X'));
        assertEquals('X', board.getCell(0, 0));
        assertFalse(board.placeMark(0, 0, 'O'));
    }

    @Test
    void testWinRow() {
        board.placeMark(0, 0, 'X');
        board.placeMark(0, 1, 'X');
        board.placeMark(0, 2, 'X');
        assertTrue(board.checkWin('X'));
    }

    @Test
    void testWinColumn() {
        board.placeMark(0, 0, 'O');
        board.placeMark(1, 0, 'O');
        board.placeMark(2, 0, 'O');
        assertTrue(board.checkWin('O'));
    }

    @Test
    void testWinDiagonal() {
        board.placeMark(0, 0, 'X');
        board.placeMark(1, 1, 'X');
        board.placeMark(2, 2, 'X');
        assertTrue(board.checkWin('X'));
    }

    @Test
    void testDraw() {
        board.placeMark(0, 0, 'X');
        board.placeMark(0, 1, 'O');
        board.placeMark(0, 2, 'X');
        board.placeMark(1, 0, 'X');
        board.placeMark(1, 1, 'O');
        board.placeMark(1, 2, 'O');
        board.placeMark(2, 0, 'O');
        board.placeMark(2, 1, 'X');
        board.placeMark(2, 2, 'X');

        assertTrue(board.isFull());
        assertFalse(board.checkWin('X'));
        assertFalse(board.checkWin('O'));
    }
}
