package DataStructuresAlgorithm.DAY10;

public class TWO_D_ARRAY_SPIRAL_Fill_matrix_with_N {
    public static void main(String[] args) {
        int[][] matrix = fillSpiralMatrix(3);
        printArrays(matrix,3);
    }
    public static int[][] fillSpiralMatrix(int n){
        int topRow=0 , bottomRow = n-1 , leftCol = 0, rightCol = n-1;
        int[][] matrix = new int[n][n];
        int total = 1;
        while(total<=n*n){
            for(int j=leftCol ; j<=rightCol && total<=n*n ; j++){
                matrix[topRow][j] = total;
                total++;
            }
            topRow++;
            for(int i=topRow ; i<=bottomRow && total<=n*n; i++){
                matrix[i][rightCol] = total++;
            }
            rightCol--;
            for(int j=rightCol ; j>=leftCol && total<=n*n; j--){
                matrix[bottomRow][j] =  total;
                total++;
            }
            bottomRow--;
            for(int i=bottomRow ; i>=topRow && total<=n*n; i--){
                matrix[i][leftCol] = total;
                total++;
            }
            leftCol++;
        }
        return matrix;
    }
    public static void printArrays(int[][] arr,int n){
        for(int i=0 ; i<n ; i++){
            for (int j=0 ; j<n ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
