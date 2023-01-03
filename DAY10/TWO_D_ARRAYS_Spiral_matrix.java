package DataStructuresAlgorithm.DAY10;

public class TWO_D_ARRAYS_Spiral_matrix {

    //

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12,13}};
        printArrays(arr1,4,3);
        spiralOrd(arr1,4,3);
    }
    public static void spiralOrd(int[][] arr,int r,int c){
        int topRow = 0, bottomRow = r - 1, leftColumn = 0, rightColumn = c - 1;
        int totalElement =0;
        while(totalElement<r*c) {


            //Top row -> leftCol to RightCol
            for (int j = leftColumn; j <= rightColumn && totalElement<r*c; j++) {
                System.out.print(arr[topRow][j] + " ");
                totalElement++;
            }
            topRow++;
            //right column -> topRow to bottomCol
            for (int i = topRow; i <= bottomRow && totalElement<r*c; i++) {
                System.out.print(arr[i][rightColumn] + " ");
                totalElement++;
            }
            rightColumn--;
            //Bottom row -> RightCol to LeftCol
            for (int j = rightColumn; j >= leftColumn && totalElement<r*c; j--) {
                System.out.print(arr[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;
            //left column -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElement<r*c; i--) {
                System.out.print(arr[i][leftColumn] + " ");
                totalElement++;
            }
            leftColumn++;
        }
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
