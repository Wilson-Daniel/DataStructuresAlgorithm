package DataStructuresAlgorithm.DAY7;

public class TWO_POINTER_Move_Event_first_then_odd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] ans = evenOdd(arr);
        printArrays(ans);
    }
    public static int[] evenOdd(int[] arr){
        int i=0 ;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]%2!=0 && arr[j]%2==0){
                swapEl(arr,i,j);
                i++;
                j--;
            }
            if(arr[i]%2 == 0){
                i++;
            }
            if(arr[j]%2!=0){
                j--;
            }

        }
        return arr;
    }
    public static int[] swapEl(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
    public static void printArrays(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
