package GOL;

public class TorusGameOfLife extends GameOfLife {

    // default constructor //
    public TorusGameOfLife() {
        board = new int[size][size];
        previous = new int[size][size];
    }

    // second Constructor //
    public TorusGameOfLife(int size) {
        super(size);
    }

    // third Constructor //
    public TorusGameOfLife(int[][] array) {
        super(array);
    }

    @Override
    public int neighbors(int i, int j) {
        int neighbors = 0;
        if(i - 1 < 0) {     // checks bounds //
            i = (Math.floorMod((j - 1), board.length)) + 1;
        }
        if(j - 1 < 0) {     // checks bounds //
            j = (Math.floorMod((j - 1), board.length)) + 1;
        }

        // top row //
        if(board[Math.floorMod(i - 1,board.length)][Math.floorMod(j - 1, board.length)] == 1) {     // top row, left column //
            neighbors++;
        }
        if(board[Math.floorMod(i - 1, board.length)][Math.floorMod(j, board.length)] == 1) {    // top row, middle column //
            neighbors++;
        }
        if(board[Math.floorMod(i - 1, board.length)][Math.floorMod(j + 1,board.length)] == 1) {     // top row, right column //
            neighbors++;
        }

        // same row //
        if(board[Math.floorMod(i, board.length)][Math.floorMod(j - 1, board.length)] == 1) {    // same row, left column //
            neighbors++;
        }
        if(board[Math.floorMod(i, board.length)][Math.floorMod(j + 1, board.length)] == 1) {    // same row, right column //
            neighbors++;
        }

        // bottom row //
        if(board[Math.floorMod(i + 1, board.length)][Math.floorMod(j - 1, board.length)] == 1) {    // bottom row, left column //
            neighbors++;
        }
        if(board[Math.floorMod(i + 1, board.length)][Math.floorMod(j, board.length)] == 1) {    // bottom row, middle column //
            neighbors++;
        }
        if(board[Math.floorMod(i + 1, board.length)][Math.floorMod(j + 1, board.length)] == 1) {    // bottom row, right column //
            neighbors++;
        }
        return neighbors;
    }

}


