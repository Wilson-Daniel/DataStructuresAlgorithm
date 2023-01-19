package DataStructuresAlgorithm.DAY18;

public class RECURSION_ARRAYS_Print_max_element {
    public static void main(String[] args) {
        int[] ans = {1,2,13,4,5,6};
        System.out.println(maxEle(ans,0));
    }
    public static int maxEle(int[] arr,int idx){
        //Base Case
        if(idx == arr.length-1){
            return arr[idx];
        }
        //sub problem -> giving answer from idx+1 to last, max element
        int smallProb = maxEle(arr,idx+1);
        //selfwork
        return Math.max(arr[idx],smallProb);
    }
}
