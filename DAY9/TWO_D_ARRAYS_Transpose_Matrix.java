package DataStructuresAlgorithm.DAY9;

public class TWO_D_ARRAYS_Transpose_Matrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,1},{3,1,2},{1,2,3}};
        printArrays(arr1,3,3);
//        transpose();
        tansInPlace(arr1,3,3);
    }
    public static void transpose(int[][] arr,int r,int c){
        int[][]ans = new int[c][r];
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                ans[j][i] = arr[i][j];
            }
        }
        System.out.println("Transpose Matrix");
        printArrays(ans,c,r);
    }

    public static void tansInPlace(int[][] arr,int r, int c){
        for(int i=0 ; i<r ; i++){
            for(int j=i ; j<c ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("Transpose Matrix In Place");
        printArrays(arr,r,c);
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
