package DataStructuresAlgorithm.DAY9;

public class TWO_D_ARRAY_Rotate_Array {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate90degree(arr,4,4);
        printArrays(arr,4,4);
    }
    public static void rotate90degree(int[][] arr,int r,int c){
        tansInPlace(arr,r,r);
        for(int i=0 ; i<r ; i++){
            reverseArray(arr[i]);
        }
    }
    public static void reverseArray(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void tansInPlace(int[][] arr,int r, int c){
        for(int i=0 ; i<r ; i++){
            for(int j=i ; j<c ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
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
