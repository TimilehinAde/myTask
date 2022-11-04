package exercise8_18;

import static exercise8_18.Mark.E;

public class Player {
    private String name;
    private Mark mark;

    public Player(String name, Mark mark) {
        this.name = name;
        this.mark = mark;
    }

    public Mark getMark() {
        return mark;
    }

    public void movement(int position, Board board) {
        Mark[][] boardSurface = board.getBoardSurface();
        if (position < 0 || position > 9) {
            throw new ArrayIndexOutOfBoundsException("Enter a valid position");
        } else {
            int row = 0;
            int column = position - 1;
            if (position > 3) {
                row = 1;
                column = position - 4;
            }
            if (position > 6) {
                row = 2;
                column = position - 7;
            }
            if (boardSurface[row][column] == E) {
                boardSurface[row][column] = mark;
            } else throw new RuntimeException("you can not play at an already selected position. please play in a selected position");
        }
    }
}