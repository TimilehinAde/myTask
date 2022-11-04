package TicTacToe;

import static TicTacToe.Maark.*;

public class Plaayer {
    private Maark maark;

    public Plaayer(Maark maark) {
        this.maark = maark;
    }
    public void playGame(int position, Booard booard) {
        if(position <= 0|| position > 9) throw new  ArrayIndexOutOfBoundsException ("you've played out of range");
        else {
            var booardSurface = booard.getSurface();
            int row = 0;
            int column = position - 1;
            if(position > 3){
                row = 1;
                column = position - 4;
            }
            if(position > 6){
                row = 2;
                column = position - 7;
            }
            if(booardSurface[row][column]== E){
                booardSurface[row][column] = maark;
            }
            else { throw new RuntimeException("position has been played");}
        }

    }
}
