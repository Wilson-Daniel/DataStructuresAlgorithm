package DataStructuresAlgorithm.DAY7;

public class ARRAYSRotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] ans = reverseArray(arr,5);
        printArrays(ans);
    }
    public static int[] reverseArray(int[] arr,int k){
        int n= arr.length;
        k = k%n;
        int[] ans = new int[n];
        int ansInd = 0;
        for(int i=n-k ; i<=n-1 ; i++){
            ans[ansInd++] = arr[i];
        }
        for(int i=0 ; i<=n-k-1 ; i++){
            ans[ansInd++] = arr[i];
        }
        return ans;
    }
    public static void printArrays(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
