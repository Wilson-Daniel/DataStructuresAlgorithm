package DataStructuresAlgorithm.DAY__68;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,5,7,2,5,2};
        printKey(arr,2,0);
    }
    public static void printKey(int[] arr, int key,int idx){
        //base case
        if(idx == arr.length){
            return;
        }
        if(arr[idx] == key){
            System.out.print(idx+" ");
        }
        printKey(arr,key,idx+1);
    }
}
