package DataStructuresAlgorithm.RECURSION;

public class RECURSION_Check_if_Arrays_isSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        System.out.println(sorted(arr,0));
    }
    public static boolean sorted(int[] arr,int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1] && sorted(arr,idx+1)){
            return true;
        }
        return false;
    }
}
