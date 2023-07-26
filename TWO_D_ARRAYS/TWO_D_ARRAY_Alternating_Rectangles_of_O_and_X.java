package DataStructuresAlgorithm.TWO_D_ARRAYS;

public class TWO_D_ARRAY_Alternating_Rectangles_of_O_and_X {
    public static void print(int n,int m ,char[][] matrix){
        int topRow=0;
        int downRow = n-1;
        int leftCol = 0;
        int rightCol = m-1;
        int totalCount =0;

        while(totalCount < n*m) {
            char value;
            if(topRow%2==0 && leftCol%2==0){
                value = 'O';
            }else{
                value = 'X';
            }
            for (int i = leftCol; i <= rightCol; i++) {
                matrix[topRow][i] = value;
                totalCount++;
                matrix[downRow][i] = value;
                totalCount++;
            }
            topRow++;
            downRow--;
            for (int i = topRow; i <= downRow; i++) {
                matrix[leftCol][i] = value;
                totalCount++;
                matrix[rightCol][i] = value;
                totalCount++;
            }
            leftCol++;
            rightCol--; 
        }
    }
    public static void main(String[] args) {
        char[][] matrix = new char[6][6];
        print(6,6,matrix);
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
