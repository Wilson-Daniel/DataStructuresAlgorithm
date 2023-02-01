package DataStructuresAlgorithm.DAY23;

public class RECURSIION_SRINGS_Print_sum_of_all_subsets_in_array {
    public static void main(String[] args) {
        int[] arr = {2,3};
        printSum(arr,0,0);
    }
    public static void printSum(int[] arr,int currAns, int idx){
        if(idx == arr.length){
            System.out.println(currAns);
            return;
        }
        int currEle = arr[idx];
        printSum(arr,currAns+currEle,idx+1);
        printSum(arr,currAns,idx+1);
    }
}
