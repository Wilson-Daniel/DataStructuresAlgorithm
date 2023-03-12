package DataStructuresAlgorithm.DAY_42;

public class Revise_Array_NoPresentOrNot {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,5,7,3,8,9};
        findNum(arr,3);
    }
    public static void findNum(int[] arr,int x){
        int[] freq = new int[100005];
        for(int i=0 ; i<arr.length; i++){
            freq[arr[i]]++;
        }
        if(freq[x] >= 1){
            System.out.println("yess");
        }else{
            System.out.println("No");
        }
    }
}
