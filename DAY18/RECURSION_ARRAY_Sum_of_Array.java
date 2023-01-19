package DataStructuresAlgorithm.DAY18;

public class RECURSION_ARRAY_Sum_of_Array {
    //Find the sum of all elements in the array using recursion
    public static void main(String[] args) {
        int[] ans = {1,2,3,4,5};
        System.out.println(sumArray(ans,0));
    }
    public static int sumArray(int[] arr,int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        //Recursive Work
        int restSum = sumArray(arr,idx+1);
        //Self-Work
        return arr[idx]+restSum;
    }
}
