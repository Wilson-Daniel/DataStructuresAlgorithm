package DataStructuresAlgorithm.DAY__78;

public class KnightTour {
    public static void main(String[] args) {
        solveKT();
    }
    public static boolean solveKT(){
        int[][] sol = new int[8][8];
        for(int i=0 ; i<sol.length ; i++){
            for(int j=0 ; j<sol.length ; j++){
                sol[i][j] = -1;
            }
        }
        int[] xMove = {2,1,-1,-2,-2,-1,1,2};
        int[] yMove = {1,2,2,1,-1,-2,-2,-1};
        //as knight starts for ceil(0,0)
        sol[0][0] = 0;
        if(!solveKTUnitl(0,0,1,sol,xMove,yMove)){
            System.out.println("Solution doesn't exist");
            return false;
        }else{
            printSolution(sol);
            return true;
        }
    }
    public static boolean solveKTUnitl(int x,int y,int movei, int sol[][],int xMove[],int yMove[]){
        int k,nextX,nextY;
        //base case
        if(movei == sol.length* sol.length){
            return true;
        }
        for(k=0 ; k<8 ; k++){
            nextX = x+xMove[k];
            nextY = y+yMove[k];
            if(isSafe(sol,nextX,nextY)){
                sol[nextX][nextX] = movei;
                if(solveKTUnitl(nextX,nextY,movei+1,sol,xMove,yMove)){
                    return true;
                }else{
                    sol[nextX][nextY] = -1;
                }
            }
        }
        return false;
    }
    public static boolean isSafe(int[][] sol,int x,int y){
        return (x>=0 && x<sol.length && y>=0 && y<sol.length && sol[x][y]==-1);
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
