package DataStructuresAlgorithm.TWO_D_ARRAYS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TWO_D_ARRAY_Search_in_Sorted_Matrix {
    static void search(int matrix[][],int x)
    {
        // code here
        int row = matrix.length-1;
        int col = 0;
        while(row>=0 && col<matrix.length){
            if(matrix[row][col]==x){
                System.out.println("Found at Row "+(row+1)+" column "+(col+1));
                return;
            }else if(x>matrix[row][col]){
                col++;
            }else{
                row--;
            }
        }
        System.out.println("Key not found!!");
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}};


    }
}
