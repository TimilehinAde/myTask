package exercise8_18;

import static exercise8_18.Mark.*;

public class Board {
    private Mark [][] boardSurface = {{E,E,E}, {E,E,E}, {E,E,E}};

    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(boardSurface[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public Mark[][] getBoardSurface() {
        return boardSurface;
    }
    public boolean checkThatPlayerHasWonAcrossRowZero(){
        boolean isX = (boardSurface[0][0] == X && boardSurface[0][1] == X && boardSurface[0][2] == X);
        boolean isO =  (boardSurface[0][0] == X && boardSurface[0][1] == X && boardSurface[0][2] == X);
       if (isX || isO ){
           return true;
       }
       else
           return false;

    }

    public boolean checkThatPlayerHasWonAcrossRowOne() {
        boolean isX = (boardSurface[1][0] == O && boardSurface[1][1] == O && boardSurface[1][2] ==O);
        boolean isO =  (boardSurface[1][0] ==O && boardSurface[1][1] == O && boardSurface[1][2] == O);
        if (isX || isO ){
            return true;
        }
        else
            return false;

    }

    public boolean checkThatPlayerHasWonRightDiagonally() {
        boolean isX = (boardSurface[0][0] == O && boardSurface[1][1] == O && boardSurface[2][2] ==O);
        boolean isO =  (boardSurface[0][0] ==O && boardSurface[1][1] == O && boardSurface[2][2] == O);
        if (isX || isO ){
            return true;
        }
        else
            return false;
    }

    public boolean checkThatPlayerHasWonLeftDiagonally() {
        boolean isX = (boardSurface[0][2] == O && boardSurface[1][1] == O && boardSurface[2][0] ==O);
        boolean isO =  (boardSurface[0][2] ==O && boardSurface[1][1] == O && boardSurface[2][0] == O);
        if (isX || isO ){
            return true;
        }
        else
            return false;
    }

    public boolean checkThatPlayerHasWonAcrossRowTwo() {
        boolean isX = (boardSurface[2][0] == O && boardSurface[2][1] == O && boardSurface[2][2] ==O);
        boolean isO =  (boardSurface[2][0] ==O && boardSurface[2][1] == O && boardSurface[2][2] == O);
        if (isX || isO ){
            return true;
        }
        else
            return false;
    }

    public boolean checkThatPlayerWonColumnZero() {
        boolean isX = (boardSurface[0][0] == X && boardSurface[1][0] == X && boardSurface[2][0] ==X);
        boolean isO =  (boardSurface[0][0] ==X && boardSurface[1][0] == X && boardSurface[2][0] == X);
        if (isX || isO ){
            return true;
        }
        else
            return false;
    }

    public boolean checkThatPlayerWonColumnOne() {
        boolean isX = (boardSurface[0][1] == X && boardSurface[1][1] == X && boardSurface[2][1] ==X);
        boolean isO =  (boardSurface[0][1] ==X && boardSurface[1][1] == X && boardSurface[2][1] == X);
        if (isX || isO ){
            return true;
        }
        else
            return false;
    }

    public boolean checkThatPlayerWonColumnTwo() {
        boolean isX = (boardSurface[0][2] == X && boardSurface[1][2] == X && boardSurface[2][2] ==X);
        boolean isO =  (boardSurface[0][2] ==X && boardSurface[1][2] == X && boardSurface[2][2] == X);
        if (isX || isO ){
            return true;
        }
        else
            return false;
    }
}
