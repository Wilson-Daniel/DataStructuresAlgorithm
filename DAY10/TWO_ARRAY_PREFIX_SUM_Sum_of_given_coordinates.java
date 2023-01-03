package DataStructuresAlgorithm.DAY10;

public class TWO_ARRAY_PREFIX_SUM_Sum_of_given_coordinates {
    //Return Sum of rectangle formed by given coordinates inside a 2-D Matrix

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,1,1},{1,1,1}};
        System.out.println(coordRecSum(matrix,1,1,2,2));
    }
    public static int coordRecSum(int[][] matrix,int r1,int l1,int r2, int l2){
        int sum=0;
        for(int i=l1 ; i<=l2 ; i++){
            for(int j=r1 ; j<=r2 ; j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }

}
