package GOL;

public class Main {
    public static void main(String[] args) {

        int [][] array = {
                {1,0,1},
                {0,0,0},
                {1,0,0}
        };

        GameOfLife flat = new GameOfLife(array);
        TorusGameOfLife torus = new TorusGameOfLife(array);

        flat.printBoard();
        int neighborsFlat = flat.neighbors(2,2);
        System.out.println("Neighbors: " + neighborsFlat);
        System.out.println();
        torus.printBoard();
        int neighborsTorus = torus.neighbors(2,2);
        System.out.println("Neighbors: " + neighborsTorus);

    }
}
