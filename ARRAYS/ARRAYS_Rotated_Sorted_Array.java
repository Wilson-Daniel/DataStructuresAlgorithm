package DataStructuresAlgorithm.ARRAYS;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ARRAYS_Rotated_Sorted_Array {
    public static void hasSum(int[] arr,int sum){
        int n=arr.length;
        int piviot = 0;
        for(int k=0 ; k<arr.length-2 ; k++){
            if(arr[k]>arr[k+1]){
                piviot = k;
            }
        }
        int i=(piviot+1) %n;
        int j=piviot;
        while(i!=j){
            if(arr[i]+arr[j] == sum){
                System.out.println(arr[i]+" "+arr[j]);
            }
            if(arr[i]+arr[j]<sum){
                j = (j+1)%n;
            }else{
                i = (n+i-1)%n;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr= {11, 15, 6, 8, 9, 10};
        //System.out.println(pairInSortedRotated(arr,6,21));
        //ArrayList<Integer> ans = pairInSortedRotated(arr,arr.length,16);
        pairInSortedRotated(arr,arr.length,16);
    }
    static void pairInSortedRotated(int[] arr, int n, int x) {
        ArrayList<Integer> finAns = new ArrayList<>();
        int i;
        for(i=0 ; i<arr.length-1 ; i++){
            if(arr[i] > arr[i+1]){
                break;
            }
        }
        int left = (i+1)%n;
        int right = i;
        while(left != right ){
            if(arr[left] + arr[right]==x){
                System.out.println(arr[left]+" "+arr[right]);
            }
            if(arr[left]+arr[right] < x){
                left = (left+1)%n;

            }else{
                right  = (n+right-1)%n;
            }
        }

        //return finAns;
    }
}
