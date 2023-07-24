package DataStructuresAlgorithm.TWO_D_ARRAYS;

public class TWO_D_ARRAY_Diagonal_sum {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        System.out.println(diagSum(matrix));
    }
    public static int diagSum(int[][] matrix){
        int sum = 0;
        //approach 1
//        for(int i=0 ; i<matrix.length ; i++){
//            for(int j=0; j<matrix[0].length ; j++){
//                if(i==j){
//                    sum+=matrix[i][j];
//                }else if(i+j == matrix.length-1){
//                    sum+=matrix[i][j];
//                }
//            }
//        }
        //approach 2
        for(int i=0 ; i<matrix.length ; i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
}
