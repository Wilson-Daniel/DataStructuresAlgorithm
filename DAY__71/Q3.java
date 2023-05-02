package DataStructuresAlgorithm.DAY__71;

import java.util.Stack;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        System.out.println(InversionCount(arr,0,arr.length-1,0));
    }
    public static int InversionCount(int[] arr,int si,int ei, int count){
        if(si>=ei){
            return count;
        }
        int mid = si+(ei-si)/2;
        if(arr[si] > arr[mid+1]){

        }
        InversionCount(arr,si,mid,count);
        InversionCount(arr,mid+1,ei,count);
        Inversion(arr,si,mid,ei,count);
        return count;
    }
    public static void Inversion(int[] arr,int si,int mid,int ei,int count){
        int i=si;
        int j = mid+1;
        if(arr[i]<arr[j]){
            //Inversion();
        }
    }


}
