package DataStructuresAlgorithm.TWO_D_ARRAYS;

public class TWO_D_ARRAY_Spiral_Matrix {
    public static void printMat(int[][] matrix,int r,int c){
        int topRow = 0;
        int downRow = r-1;
        int leftCol = 0;
        int rightCol = c-1;
        int totalCount= 0;
        while(totalCount<r*c){
            //top
            for(int j=leftCol ; j<=rightCol ; j++){
                System.out.print(matrix[topRow][j]+" ");
                totalCount++;
            }
            topRow++;
            //right
            for(int i=topRow ; i<=downRow ; i++){
                System.out.print(matrix[i][rightCol]+" ");
                totalCount++;
            }
            rightCol--;
            //bottom
            for(int j=rightCol ; j>=leftCol ; j--){

                System.out.print(matrix[downRow][j]+" ");
                totalCount++;
            }
            downRow--;
            //left
            for(int i=downRow ; i>=topRow ; i--){

                System.out.print(matrix[i][leftCol]+" ");
                totalCount++;
            }
            leftCol++;
        }

    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printMat(matrix,4,4);
    }
}
