package DataStructuresAlgorithm.DAY__66;

public class ArrayIsSorted {

    public static void main(String[] args) {
        int[] arr = {1,2,3,7,4,5,6};
        System.out.println(isArray(arr,0));
    }

    public static boolean isArray(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isArray(arr,i+1);
    }
}
