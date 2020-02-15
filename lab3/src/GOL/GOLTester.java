package GOL;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GOLTester {
        // boards to be used //
        int[][] board1 = {

                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,1,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };

        int[][] board2 = {
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,1,1,1,0},
                {0,1,1,1,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
        };

        int[][] board3 = {
                {0,0,0,0,0,0},
                {0,1,1,0,0,0},
                {0,1,1,0,0,0},
                {0,0,0,1,1,0},
                {0,0,0,1,1,0},
                {0,0,0,0,0,0},
        };

        int[][] board4 = {
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,1,0,1,0,1,0,0,0},
                {0,0,0,1,0,1,0,1,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,1,0,1,0,1,0,0,0},
                {0,0,0,1,0,1,0,1,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
        };

        int[][] board5 = {
                {0,0,1},
                {0,1,0},
                {1,0,0},
        };


        // neighbors() test cases for GameOfLife //
        @Test
        public void testNeighbors1() {
            GameOfLife test1 = new GameOfLife(board1);
            test1.neighbors(3,3);
            assertEquals(2, test1.neighbors(3,3));
        }

        @Test
        public void testNeighbors2() {
            GameOfLife test2 = new GameOfLife(board2);
            test2.neighbors(1,1);
            assertEquals(1, test2.neighbors(1,1));
        }

        @Test
        public void testNeighbors3() {
            GameOfLife test3 = new GameOfLife(board3);
            test3.neighbors(3,2);
            assertEquals(4, test3.neighbors(3,2));
        }

        @Test
        public void testNeighbors4() {
            GameOfLife test4 = new GameOfLife(board4);
            test4.neighbors(0,0);
            assertEquals(0, test4.neighbors(0,0));
        }

        @Test
        public void testNeighbors5() {
            GameOfLife test5 = new GameOfLife(board5);
            test5.neighbors(2,2);
            //expected output:
            assertEquals(1, test5.neighbors(2,2));
        }

        // oneStep() test cases for GameOfLife //
        @Test
        public void testOneStep1() {
            GameOfLife test1 = new GameOfLife(board1);
            test1.printPrevious();
            test1.oneStep();
            System.out.println();
            test1.printBoard();
        }

        @Test
        public void testOneStep2() {
            GameOfLife test2 = new TorusGameOfLife(board2);
            test2.printPrevious();
            test2.oneStep();
            System.out.println();
            test2.printBoard();
        }

        @Test
        public void testOneStep3() {
            GameOfLife test3 = new TorusGameOfLife(board3);
            test3.printPrevious();
            test3.oneStep();
            System.out.println();
            test3.printBoard();
        }

        @Test
        public void testOneStep4() {
            GameOfLife test4 = new GameOfLife(board4);
            test4.printPrevious();
            test4.oneStep();
            System.out.println();
            test4.printBoard();
        }

        @Test
        public void testOneStep5() {
            GameOfLife test5 = new GameOfLife(board5);
            test5.printPrevious();
            test5.oneStep();
            System.out.println();
            test5.printBoard();
        }

        // evolution() test cases for GameOfLife //
        @Test
        public void testEvolution1() {
            GameOfLife test1 = new TorusGameOfLife(board1);
            test1.printPrevious();
            test1.evolution(1);
            System.out.println();
            test1.printBoard();
        }

        @Test
        public void testEvolution2() {
            GameOfLife test2 = new TorusGameOfLife(board2);
            test2.printPrevious();
            test2.evolution(2);
            System.out.println();
            test2.printBoard();
        }

        @Test
        public void testEvolution3() {
            GameOfLife test3 = new TorusGameOfLife(board3);
            test3.printPrevious();
            test3.evolution(3);
            System.out.println();
            test3.printBoard();
        }

        @Test
        public void testEvolution4() {
            GameOfLife test4 = new TorusGameOfLife(board4);
            test4.printPrevious();
            test4.evolution(4);
            System.out.println();
            test4.printBoard();
        }

        @Test
        public void testEvolution5() {
            GameOfLife test5 = new TorusGameOfLife(board5);
            test5.printPrevious();
            test5.evolution(5);
            System.out.println();
            test5.printBoard();
        }

        // neighbors() test cases for TorusGameOfLife //
        @Test
        public void testTorusNeighbors1() {
            TorusGameOfLife test1 = new TorusGameOfLife(board1);
            test1.neighbors(3,3);
            assertEquals(2, test1.neighbors(3,3));
        }

        @Test
        public void testTorusNeighbors2() {
            TorusGameOfLife test2 = new TorusGameOfLife(board2);
            test2.neighbors(1,1);
            assertEquals(1, test2.neighbors(1,1));
        }

        @Test
        public void testTorusNeighbors3() {
            TorusGameOfLife test3 = new TorusGameOfLife(board3);
            test3.neighbors(0,0);
            assertEquals(1, test3.neighbors(0,0));
        }

        @Test
        public void testTorusNeighbors4() {
            TorusGameOfLife test4 = new TorusGameOfLife(board4);
            test4.neighbors(11,0);
            assertEquals(0, test4.neighbors(11,0));
        }

        @Test
        public void testTorusNeighbors5() {
            TorusGameOfLife test5 = new TorusGameOfLife(board5);
            test5.neighbors(1,1);
            assertEquals(2, test5.neighbors(1,1));
        }

        // oneStep() test cases for TorusGameOfLife //
        @Test
        public void testTorusOneStep1() {
            GameOfLife test1 = new GameOfLife(board1);
            test1.printPrevious();
            test1.oneStep();
            System.out.println();
            test1.printBoard();
        }

        @Test
        public void testTorusOneStep2() {
            GameOfLife test2 = new TorusGameOfLife(board2);
            test2.printPrevious();
            test2.oneStep();
            System.out.println();
            test2.printBoard();
        }
        @Test
        public void testTorusOneStep3() {
            GameOfLife test3 = new TorusGameOfLife(board3);
            test3.printPrevious();
            test3.oneStep();
            System.out.println();
            test3.printBoard();
        }

        @Test
        public void testTorusOneStep4() {
            GameOfLife test4 = new GameOfLife(board4);
            test4.printPrevious();
            test4.oneStep();
            System.out.println();
            test4.printBoard();
        }

        @Test
        public void testTorusOneStep5() {
            GameOfLife test5 = new GameOfLife(board5);
            test5.printPrevious();
            test5.oneStep();
            System.out.println();
            test5.printBoard();
        }

        // evolution() test cases for TorusGameOfLife //
        @Test
        public void testTorusEvolution1() {
            GameOfLife test1 = new TorusGameOfLife(board1);
            test1.printPrevious();
            test1.evolution(1);
            System.out.println();
            test1.printBoard();
        }

        @Test
        public void testTorusEvolution2() {
            GameOfLife test2 = new TorusGameOfLife(board2);
            test2.printPrevious();
            test2.evolution(2);
            System.out.println();
            test2.printBoard();
        }

        @Test
        public void testTorusEvolution3() {
            GameOfLife test3 = new TorusGameOfLife(board3);
            test3.printPrevious();
            test3.evolution(3);
            System.out.println();
            test3.printBoard();
        }

        @Test
        public void testTorusEvolution4() {
            GameOfLife test4 = new TorusGameOfLife(board4);
            test4.printPrevious();
            test4.evolution(4);
            System.out.println();
            test4.printBoard();
        }

        @Test
        public void testTorusEvolution5() {
            GameOfLife test5 = new TorusGameOfLife(board5);
            test5.printPrevious();
            test5.evolution(5);
            System.out.println();
            test5.printBoard();
        }

}

