package DataStructuresAlgorithm.DAY_42;

public class Revise_ARRAYS_PrefixSum {
    public static void rotate(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static int[] rotArr(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        rotate(arr,0,n-k-1);
        rotate(arr,n-k,n-1);
        rotate(arr,0,n-1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        rotArr(arr,5);
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Success!! Yessssss!!");
    }
}
