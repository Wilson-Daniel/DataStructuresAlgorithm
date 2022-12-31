package DataStructuresAlgorithm.DAY7;

public class ARRAYSRotateArrayByKWithoutNewSpace {

    public static void rotateArray(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }
    public static int[] reverseArray(int[] arr,int k){
        int n= arr.length;
        k = k%n;
        rotateArray(arr,0,n-k-1);
//        int i=0;
//        int j = n-k-1;
//        while(i<j){
//            int temp = arr[i];
//            arr[i++] = arr[j];
//            arr[j--] = temp;
//
//        }
        rotateArray(arr,n-k,n-1);
//        int i1 = n-k;
//        int j1 = n-1;
//        while(i1<j1){
//            int temp = arr[i1];
//            arr[i1++] = arr[j1];
//            arr[j1--] = temp;
//        }
        rotateArray(arr,0,n-1);
//        int i2 = 0;
//        int j2 = n-1;
//        while(i2<j2){
//            int temp = arr[i2];
//            arr[i2++] = arr[j2];
//            arr[j2--] = temp;
//        }
        return arr;
    }
    public static void printArrays(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] ans = reverseArray(arr,5);
        printArrays(ans);
    }
}
