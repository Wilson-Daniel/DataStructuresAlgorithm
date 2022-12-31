package DataStructuresAlgorithm.DAY7;

public class TWO_POINTER_APPROACH_Return_Square_of_Array {
    public static void main(String[] args) {
        int[] arr = {-10,-5,-2,1,4,3};
        int[] ans = sortSquares(arr);
        //reverse(ans); // WITHOUT RREVERSE When putting k = arr.length-1
        printArrays(ans);
    }
    public static int[] sortSquares(int[] arr){
        int i=0 ;
        int j = arr.length-1;
        int ansInd = arr.length-1;//with this no need to use reverse function
        int[] ans = new int[arr.length];
        while(i<=j){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                ans[ansInd--]= arr[i]*arr[i];
                i++;
            }else{
                ans[ansInd--] = arr[j]*arr[j];
                j--;
            }
        }

        return ans;
    }

    public static void printArrays(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int[] arr){
        int i = 0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
