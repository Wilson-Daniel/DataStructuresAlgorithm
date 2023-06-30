package DataStructuresAlgorithm.ARRAYS;

public class ARRAYS_Reverse_The_Array {
    public static void main(String[] args) {
        int[] arr = {7,34,8,3,3,7,9,1,5,78};
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
