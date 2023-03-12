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
        rotateArray(arr,n-k,n-1);
        rotateArray(arr,0,n-1);

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
