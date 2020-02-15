package GOL;

public class GameOfLife {

    // board attributes //
    int size;
    int[][] board;
    int[][] previous;

    // default constructor //
    public GameOfLife() {
        board = new int[size][size];
        previous = new int[size][size];
    }

    // second Constructor //
    public GameOfLife(int size) {
        board = new int[size][size];
        previous = new int[size][size];
    }

    // third Constructor //
    public GameOfLife(int[][] array) {
        board = new int[array.length][array[0].length];
        previous = new int[array.length][array[0].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                board[i][j] = array[i][j];
            }
        }
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                previous[i][j] = array[i][j];
            }
        }
    }

    // print board method //
    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printPrevious() {
        for (int i = 0; i < previous.length; i++) {
            for (int j = 0; j < previous[0].length; j++) {
                System.out.print(previous[i][j] + " ");
            }
            System.out.println();
        }
    }

    // get board method //
    public int[][] getBoard() {
        return board;
    }

    // neighbors method //
    public int neighbors(int i, int j) {
        int total = 0;

        // top row //
        if ((i - 1 >= 0) && (i - 1 < board[i].length)) {    // checks bounds //
            if ((j - 1 >= 0) && (j - 1 < board.length)) {   // checks bounds //
                if (board[i - 1][j - 1] == 1) {     // checks top row, left column //
                    total++;
                }
                if (board[i - 1][j] == 1) {     // checks top row, middle column //
                    total++;
                }
                if (j + 1 < board.length) {     // checks bounds //
                    if (board[i - 1][j + 1] == 1) {     // checks top row, right column //
                        total++;
                    }
                }
            }
        }

        // same row //
        if ((j - 1 >= 0) && (j - 1 < board.length)) {   // checks bounds //
            if (board[i][j - 1] == 1) {     // checks left column //
                total++;
            }
        }
        if (j + 1 < board.length) {     // checks bounds //
            if (board[i][j + 1] == 1) {     // checks right column //
                total++;
            }
        }

        // bottom row //
        if ((i + 1 >= 0) && (i + 1 < board[i].length)) {    // checks bounds //
            if ((j - 1 >= 0) && (j - 1 < board.length)) {   // checks bounds //
                if (board[i + 1][j - 1] == 1) {     // checks bottom row, left column //
                    total++;
                }
            }
            if (board[i + 1][j] == 1) {     // checks bottom row, middle column //
                total++;
            }
            if (j + 1 < board.length) {     // checks bounds //
                if (board[i + 1][j + 1] == 1) {     // checks bottom row, left column //
                    total++;
                }
            }
        }
        return total;
    }

    // oneStep method //
    public void oneStep() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                previous[i][j] = board[i][j];
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                previous[i][j] = neighbors(i, j);
            }
        }

        // rules //
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // Any live cell with fewer than two live neighbours dies, as if by underpopulation. //
                if (previous[i][j] == 1) {
                    board[i][j] = 0;
                }
                // Any live cell with two or three live neighbours lives on to the next generation. //
                else if (previous[i][j] == 2 || previous[i][j] == 3) {
                    board[i][j] = 1;
                }
                // Any live cell with more than three live neighbours dies, as if by overpopulation. //
                else if (previous[i][j] > 3) {
                    board[i][j] = 0;
                }
                // Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction. //
                else if (board[i][j] == 0 && previous[i][j] > 3) {
                    board[i][j] = 1;
                }

                if ((previous[i][j] == 0) && board[i][j] == 1) {
                    board[i][j] = 0;
                }
                else if(previous[i][j] == 2 && board[i][j] == 0) {
                    board[i][j] = 0;
                }
                else if (previous[i][j] > 3 && board[i][j] == 0) {
                    board[i][j] = 1;
                }
                if((previous[i][j] == 0) && board[i][j] == 1){
                    board[i][j] = 0;
                }
            }
        }
    }

    // evolution method //
    public void evolution (int n) {
        for(int i = 0; i < n; i++) {
            oneStep();
        }
    }

}




