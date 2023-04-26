package DataStructuresAlgorithm.DAY__69.ALPHA_RECURSION_REVSION;

public class CheckIFArrayISSorted {
    public static void main(String[] args) {
        int[] arr = {3,4,5,9,7};
        System.out.println(sorted(arr,0));
    }
    public static boolean sorted(int[] arr,int idx){
        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx]>arr[idx+1]){
            return false;
        }
        return sorted(arr,idx+1);


    }
}
