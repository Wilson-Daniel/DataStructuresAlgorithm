package DataStructuresAlgorithm.TWO_D_ARRAYS;

public class TWO_D_ARRAY_Rotate_by_Ninty {
    static void rotateMatrix(int arr[][]) {
        // code here
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i ; j<arr[0].length ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0 ; i<arr[0].length ; i++){
            int[] help = new int[arr.length];

            for(int j=0 ; j<arr.length ; j++){
                help[j] = arr[j][i];
            }

            reverse(help);
            for(int j=0 ; j<arr.length ; j++){
                arr[j][i] = help[j];
            }

        }
    }
    public static void reverse(int[] smlArr){
        int i=0;
        int j=smlArr.length-1;
        while(i<=j){
            int temp = smlArr[i];
            smlArr[i] = smlArr[j];
            smlArr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        rotateMatrix(matrix);
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
