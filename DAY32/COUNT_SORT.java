package DataStructuresAlgorithm.DAY32;

import java.util.Arrays;

public class COUNT_SORT {
    public static void countSort(int[] arr,int n){
        //finding the max element
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int[] count = new int[max+1];
        for (int i=0 ; i<n ; i++){
            count[arr[i]]++;
        }
        for(int i:count){
            System.out.print(i+" ");
        }
        int k=0;
        for(int i=0 ; i< count.length ; i++){
            for(int j=0 ; j<count[i] ; j++){
                arr[k++] = i;
            }
        }
    }
    public static int[] stableCountSort(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
        int[] count = new int[max+1];
        for (int i=0 ; i<n ; i++){
            count[arr[i]]++;
        }
        for(int i:count){
            System.out.print(i+" ");
        }
        System.out.println();
            ///making prefix sum in count only
        for(int i=1 ; i<count.length ; i++){
            count[i]+= count[i-1];
        }
        int[] output = new int[n];
        for(int i:count){
            System.out.print(i+" ");
        }
        System.out.println();
        // find the index of each element from arr and put it in index array
        for(int i=n-1 ; i>=0 ; i--){
            int arrval = arr[i];
            int trav = count[arrval] - 1;
            output[trav] =arr[i];
            count[arr[i]]-=1;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] ans = {4,3,1,5,3,1,3,5};
//        countSort(ans,6);
        int[] out = stableCountSort(ans);

        for(int i:out){
            System.out.print(i+" ");
        }
    }
}
