package DataStructuresAlgorithm.TWO_D_ARRAYS;

import java.util.ArrayList;

public class TWO_D_ARRAY_Set_Matrix_Zero {
    public static class P{
        int i;
        int j;
        P(int i,int j){
            this.i = i;
            this.j = j;
        }
    }

    public static void setZeroes(int[][] matrix) {
        ArrayList<P> arr = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    arr.add(new P(i, j));
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            P pp = arr.get(i);
            int row = pp.i;
            int col = pp.j;
            for (int value = 0; value < matrix[0].length; value++) {
                matrix[row][value] = 0;
            }
            for (int value = 0; value < matrix.length; value++) {
                matrix[value][col] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}};
        setZeroes(matrix);
    }
}
