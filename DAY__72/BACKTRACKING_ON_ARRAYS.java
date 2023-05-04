package DataStructuresAlgorithm.DAY__72;

public class BACKTRACKING_ON_ARRAYS {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] ans = array(arr,0);
        for(int i: ans){
            System.out.print(i+" ");
        }
    }
    public static int[] array(int[] arr,int idx){
        if(idx == arr.length-1){
            arr[idx] = idx+1-2;
            return arr;
        }
        arr[idx] = idx+1;
        array(arr,idx+1);
        arr[idx] += -2;
        return arr;
    }
}
