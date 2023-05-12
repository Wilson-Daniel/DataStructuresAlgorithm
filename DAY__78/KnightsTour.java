package DataStructuresAlgorithm.DAY__78;

public class KnightsTour {
    public static void main(String[] args) {

        solveKT();
    }

    public static boolean solveKTUtil(int x, int y, int movei, int sol[][], int xMove[],int yMove[]) {
        int k, next_x, next_y;
        if (movei == sol.length * sol.length)
            return true;
        for (k = 0; k < 8; k++) {
            next_x = x + xMove[k];
            next_y = y + yMove[k];
            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove))
                    return true;
                else
                    sol[next_x][next_y] = -1; // backtracking
            }
        }
        return false;
    }

    public static boolean isSafe(int x, int y, int sol[][]){
        return (x >= 0 && x < sol.length && y >= 0 && y < sol.length && sol[x][y] == -1);
    }

    public static boolean solveKT() {
        int sol[][] = new int[8][8];
        for (int x = 0; x < sol.length; x++)
            for (int y = 0; y < sol.length; y++)
                sol[x][y] = -1;
        int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
        //As the Knight starts from cell(0,0)
        sol[0][0] = 0;
        if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
            System.out.println("Solution does not exist");
            return false;
        }
        else {
            printSolution(sol);
            return true;
        }
    }

    public static void printSolution(int[][] sudoku){
        for(int i=0 ; i<sudoku.length ; i++){
            for(int j=0 ; j<sudoku.length ; j++){
                System.out.print(sudoku[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
