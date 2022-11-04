package TicTacToe;


import org.junit.jupiter.api.Test;

import static TicTacToe.Maark.*;


public class Booard {
    private Maark[][] surface = {{E,E,E},{E,E,E},{E,E,E}};



    public Maark[][] getSurface() {
        return surface;
    }

    public void displayBooardSurface() {
        for (int i = 0; i < 3; i++){
            System.out.print(" | ");
            for (int j = 0; j<3; j++){
                System.out.print(surface[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    private boolean isAWinnerOnRowZero() {


        boolean isX = surface[0][0] == X && surface[0][1] == X && surface[0][2] == X;
        boolean isO = surface[0][0] == O && surface[0][1] == O && surface[0][2] == O;
        if (isX || isO ){
            return true;
        }
        else return false;

    }

    private boolean isAWinnerOnRowOne() {
        boolean isX = surface[1][0] == X && surface[1][1] == X && surface[1][2] == X;
        boolean isO = surface[1][0] == O && surface[1][1] == O && surface[1][2] == O;
        if (isX || isO ){
            return true;
        }
        else return false;
    }

    private boolean isAWinnerOnRowTwo() {
        boolean isX = surface[2][0] == X && surface[2][1] == X && surface[2][2] == X;
        boolean isO = surface[2][0] == O && surface[2][1] == O && surface[2][2] == O;
        if (isX || isO ){
            return true;
        }
        else return false;
    }

    private boolean isAWinnerOnColumnOne() {
        boolean isX = surface[0][0] == X && surface[0][1] == X && surface[0][2] == X;
        boolean isO = surface[0][0] == O && surface[0][1] == O && surface[0][2] == O;
        if (isX || isO ){
            return true;
        }
        else return false;
    }

    private boolean isAWinnerOnColumnTwo() {
        boolean isX = surface[1][0] == X && surface[1][1] == X && surface[1][2] == X;
        boolean isO = surface[1][0] == O && surface[1][1] == O && surface[1][2] == O;
        if (isX || isO ){
            return true;
        }
        else return false;
    }

    private boolean isAWinnerOnColumnThree() {
        boolean isX = surface[0][2] == X && surface[1][2] == X && surface[2][2] == X;
        boolean isO = surface[0][2] == O && surface[1][2] == O && surface[2][2] == O;
        if (isX || isO ){
            return true;
        }
        else return false;
    }
    private boolean isAWinnerLeftDiagonally() {
        boolean isX = surface[0][0] == X && surface[1][1] == X && surface[2][2] == X;
        boolean isO = surface[0][0] == O && surface[1][1] == O && surface[1][2] == O;
        if (isX || isO ){
            return true;
        }
        else return false;
    }
    private boolean isAWinnerRightDiagonally() {
        boolean isX = surface[0][2] == X && surface[1][1] == X && surface[2][0] == X;
        boolean isO = surface[0][2] == O && surface[1][1] == O && surface[2][0] == O ;
        if (isX || isO ){
            return true;
        }
        else return false;
    }
    public boolean isAWinner(){
        if(isAWinnerLeftDiagonally()) return true;
        if (isAWinnerOnColumnOne()) return true;
        if (isAWinnerRightDiagonally()) return true;
        if (isAWinnerOnColumnTwo()) return true;
        if (isAWinnerOnColumnThree()) return true;
        if (isAWinnerOnRowZero()) return true;
        if (isAWinnerOnRowTwo()) return true;
        if (isAWinnerOnRowOne()) return true;
        else return false;
    }
    public boolean isATie(){
        if (!isAWinner() && !isNotE()) return true;
        else return false;
    }

    private boolean isNotE() {
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
               if (surface[i][j] == E){
                   return true;
               }
            }
        }
        return false;
    }

}
