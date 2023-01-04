package DataStructuresAlgorithm.DAY10;

public class TWO_ARRAY_PREFIX_SUM_Sum_of_given_coordinates {
    //Return Sum of rectangle formed by given coordinates inside a 2-D Matrix

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,1,1},{1,1,1}};
//        findprefixSum();
        System.out.println(coordRecSum(matrix,0,0,2,2));
        System.out.println(coordRectanSum2(matrix,0,0,2,2));

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
    public static void findprefixSum(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0 ; i<r ; i++){
            for(int j=1 ; j<c ; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }

    public static int coordRectanSum2(int[][] matrix,int r1,int l1,int r2, int l2){
        int sum=0;
        findprefixSum(matrix);

        ///l1 l2 are rows
        for(int i=l1 ; i<=l2 ; i++){
            if(r1>=1)
                sum+=matrix[i][r2]-matrix[i][r1-1];
            else
                sum+=matrix[i][r2];
        }
        return sum;
    }

}
