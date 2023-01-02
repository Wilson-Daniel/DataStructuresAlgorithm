package DataStructuresAlgorithm.DAY9;

import java.sql.SQLOutput;

public class TWO_DIMENSION_ARRAYS_Multiplication_Of_Arrays {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,1},{3,1,2}};
        int[][] arr2 = {{2,1},{1,3},{1,1}};
        multiplication(arr1,2,3,arr2,3,2);
    }
    public static void multiplication(int[][] arr1,int r1,int c1, int[][]arr2, int r2, int c2){
        if(c1 != r2){
            System.out.println("Multiplication not possible - Wrong Input");
            return;
        }
        int[][] ans = new int[r1][c2];
        for(int i=0 ; i<r1 ; i++){
            for(int j=0 ; j<c2 ; j++){
                for(int k=0 ; k<c1; k++){
                    ans[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        printArrays(ans,r1,c2);

    }
    public static void printArrays(int[][] arr,int r1,int c1){
        for(int i=0 ; i<r1 ; i++){
            for (int j=0 ; j<c1 ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
