package DataStructuresAlgorithm.DAY__78;

import static DataStructuresAlgorithm.DAY__74.BACKTRACKING_Sudoku.printSudoku;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] sudoku ={{0,0,8,0,0,0,0,0,0},
                {4,9,0,1,5,7,0,0,2},
                {0,0,3,0,0,4,1,9,0},
                {1,8,5,0,6,0,0,2,0},
                {0,0,0,0,2,0,0,6,0},
                {9,6,0,4,0,5,3,0,0},
                {0,3,0,0,7,2,0,0,4},
                {0,4,9,0,3,0,0,5,7},
                {8,2,7,0,0,9,0,1,3},
        };
        if(sudokuSolver(sudoku,0,0)){
            System.out.println("Solution Exist");
            printBoard(sudoku);
        }else{
            System.out.println("Sollution does't exist");
        }
    }
    public  static boolean sudokuSolver(int sudoku[][],int row,int col){
        if(row == 9){
            //printBoard(sudoku);
            return true;
        }
        int nextRow = row, nextCol = col+1;
        if(col+1 == 9){
            nextRow =row+1;
            nextCol = 0;
        }
        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku,nextCol,nextCol);
        }
        for(int digit=0 ; digit<=9 ; digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku,nextRow,nextCol)){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }
    public static boolean isSafe(int[][] sudoku, int row,int col,int digit){
        //row
        for(int i=0 ; i<=8 ; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }
        //column
        for(int j=0; j<=8 ; j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sc ; i<sc+3 ; i++){
            for(int j=sr; j<sr+3 ; j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printBoard(int[][] board){
        for(int i=0 ; i<board.length ; i++){
            for(int j=0 ; j<board.length ; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

}
