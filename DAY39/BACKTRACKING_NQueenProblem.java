package DataStructuresAlgorithm.DAY39;

public class BACKTRACKING_NQueenProblem {
    final int N=4;
    boolean solveNQ(){
        int board[][] = {{0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}};
        if(nQueen(board,0) == false){
            System.out.println("Solution does not exist");
            return false;
        }
        printSol(board);
        return true;
    }

    private boolean nQueen(int[][] board, int row) {
        if(row >= N) return true;
        for(int col=0 ; col<N ; col++){
            if(isSafe(board,row,col)){
                board[row][col] = 1;
                if(nQueen(board,row+1)==true){
                    return true;
                }

                board[row][col] = 0;
            }
        }
        return false;
    }
    boolean isSafe(int[][] board,int row, int col){
        //checking the row in left
        int i,j;
        for(i=0 ; i<col ; i++){
            if(board[row][i] == 1){
                return false;
            }
        }
        //checking upper diagonal on left side
        for(i=row,j=col ; i>=0 && j>=0 ; i--,j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        //checking lower diagonal on left
        for(i=row,j=col; j>=0 && i<N ; i++,j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        return true;
    }

    void printSol(int[][] board){//for printing the final board
        for(int i=0 ; i<N ; i++){
            for(int j=0; j<N; j++){
                System.out.print(" "+board[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        BACKTRACKING_NQueenProblem nqueen = new BACKTRACKING_NQueenProblem();
        nqueen.solveNQ();

    }
}

