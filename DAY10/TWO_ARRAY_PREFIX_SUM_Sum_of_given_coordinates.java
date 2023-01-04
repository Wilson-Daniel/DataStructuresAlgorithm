package DataStructuresAlgorithm.DAY10;

public class TWO_ARRAY_PREFIX_SUM_Sum_of_given_coordinates {
    //Return Sum of rectangle formed by given coordinates inside a 2-D Matrix

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,1,1},{1,1,1}};
//        findprefixSum();
        System.out.println(coordRectanSum1(matrix,0,0,2,2));
        System.out.println(coordRectanSum2(matrix,0,0,2,2));
        System.out.println(coordRectanSum3(matrix,0,0,2,2));

    }

    public static void findprefixSum2(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;
        //Traverse horizontally to find row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
    }

    public static void findprefixSum3(int[][] matrix){
        //calculate row-wise and column wise sum
        //matrix[i][j] = sumRectangle((0,0) to (i,j) coordinates)

        int r = matrix.length;
        int c = matrix[0].length;
        //Traverse horizontally to find row-wise prefix sum
        for(int i=0 ; i<r ; i++){
            for(int j=1 ; j<c ; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        //traverse vertically to find col-wise prefix sum
        for(int j=0 ; j<c ; j++){
            for(int i=1 ; i<r ; i++){
                matrix[i][j] +=matrix[i-1][j];
            }
        }
    }

    public static int coordRectanSum1(int[][] matrix,int r1,int l1,int r2, int l2){
        int sum=0;
        for(int i=l1 ; i<=l2 ; i++){
            for(int j=r1 ; j<=r2 ; j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }

    public static int coordRectanSum2(int[][] matrix,int r1,int l1,int r2, int l2){
        int sum=0;
        findprefixSum2(matrix);

        ///l1 l2 are rows
        for(int i=l1 ; i<=l2 ; i++){
            if(r1>=1)
                sum+=matrix[i][r2]-matrix[i][r1-1];
            else
                sum+=matrix[i][r2];
        }
        return sum;
    }

    public static int coordRectanSum3(int[][] matrix,int r1, int l1, int r2, int l2){
        int ans = 0, sum=0 ,up = 0, left = 0, upleft = 0;
        findprefixSum3(matrix);

        sum = matrix[l2][r2];
        if(r1>=1) {
            left = matrix[l2][r1 - 1];
        }
        if(l1>=1) {
            up = matrix[l1 - 1][r2];
        }
        if(l1>=1 && r1>=1) {
            upleft = matrix[l1 - 1][r1 - 1];
        }
        ans  = sum - up - left + upleft;
        return ans;
    }

}
