package ticTacToe;

import com.timmy.exercise8_18.Board;
import com.timmy.exercise8_18.Mark;
import com.timmy.exercise8_18.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.timmy.exercise8_18.Mark.*;
import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    private Player player1;
    private Player player2;
    private Board board;

    @BeforeEach
    void setUp() {
        player1 = new Player("timi", X);
        player2 = new Player("Kapi", O);
        board = new Board();
    }
    @Test
    void testThatPlayersExist(){
        assertNotNull(player1);
        assertNotNull(player2);
    }

    @Test
    void testThatBoardCanBeDisplayed(){
        board.displayBoard();
    }
    @Test
    void testThatPlayerHasMarkConstant(){
        assertEquals(X, player1.getMark());
        assertEquals(O, player2.getMark());
    }
    @Test
    void testThatPlayer1CanPlayTicTacToeOnDisplayBoard(){
    Mark[][] boardSurface = board.getBoardSurface();
    assertEquals(E, boardSurface[0][0]);
    player1.movement(1, board);
    assertEquals(X, boardSurface[0][0]);
    }
    @Test
    void testThatPlayer2CanPlayTicTacToeOnDisplayBoard(){
        Mark[][] boardSurface = board.getBoardSurface();
        assertEquals(E, boardSurface[1][1]);
        player2.movement(5, board);
        assertEquals(O, boardSurface[1][1]);
    }
    @Test
   void testThatAPlayerCannotPlayInAnAlreadySelectedPosition(){
        Mark[][] boardSurface = board.getBoardSurface();
        player1.movement(5, board);
        assertEquals(X, boardSurface[1][1]);
        assertThrows(RuntimeException.class,() -> player1.movement(5, board));
        assertEquals(X, boardSurface[1][1]);
    }
    @Test
    void testThatAPlayerHasWonAcrossRowZero(){
        Mark [][] boardSurface = board.getBoardSurface();
        player1.movement(1, board);
        player1.movement(2, board);
        player1.movement(3, board);
        assertTrue(board.checkThatPlayerHasWonAcrossRowZero());
    }
    @Test
    void testThatAPlayerHasWonAcrossRowOne(){
        Mark [][] boardSurface = board.getBoardSurface();
        player2.movement(4, board);
        player2.movement(5, board);
        player2.movement(6, board);
        assertTrue(board.checkThatPlayerHasWonAcrossRowOne());
    }
    @Test
    void testThatAPlayerHasWonAcrossRowTwo(){
        Mark [][] boardSurface = board.getBoardSurface();
        player2.movement(7, board);
        player2.movement(8, board);
        player2.movement(9, board);
        assertTrue(board.checkThatPlayerHasWonAcrossRowTwo());
    }
    @Test
    void testThatAPlayerHasWonRightDiagonally(){
        Mark [][] boardSurface = board.getBoardSurface();
        player2.movement(1, board);
        player2.movement(5, board);
        player2.movement(9, board);
        assertTrue(board.checkThatPlayerHasWonRightDiagonally());
    }
    @Test
    void testThatAPlayerHasWonLeftDiagonally(){
        Mark [][] boardSurface = board.getBoardSurface();
        player2.movement(3, board);
        player2.movement(5, board);
        player2.movement(7, board);
        assertTrue(board.checkThatPlayerHasWonLeftDiagonally());
    }
    @Test
    void testThatAPlayerWonColumnZero(){
        Mark [][] boardSurface = board.getBoardSurface();
        player1.movement(1, board);
        player1.movement(4, board);
        player1.movement(7, board);
        assertTrue(board.checkThatPlayerWonColumnZero());
    }
    @Test
    void testThatAPlayerWonColumnOne(){
        Mark [][] boardSurface = board.getBoardSurface();
        player1.movement(2, board);
        player1.movement(5, board);
        player1.movement(8, board);
        assertTrue(board.checkThatPlayerWonColumnOne());
    }
    @Test
    void testThatAPlayerWonColumnTwo(){
        Mark [][] boardSurface = board.getBoardSurface();
        player1.movement(3, board);
        player1.movement(6, board);
        player1.movement(9, board);
        assertTrue(board.checkThatPlayerWonColumnTwo());
    }
    @Test
    void testThatItIsATie(){
        Mark [][] boardSurface = board.getBoardSurface();
    }

}