package DataStructuresAlgorithm.DAY19.ASSIGNMENT;

import java.util.ArrayList;

public class Q4 {
//    Q4 - Given two sorted arrays A and B of length m and n respectively, generate all possible arrays
//    such that the first element is taken from A then from B then from A, and so on in increasing order
//    till the arrays are exhausted. The generated arrays should end with an element from B.

//    Input1:
//    m = 3
//    n = 4
//    A = {10, 15, 25}
//    B = {1, 5, 20, 30}
//    Output1:
//            10 20
//            10 20 25 30
//            10 30
//            15 20
//            15 20 25 30
//            15 30
//            25 30
    public static void main(String[] args) {
        int[] A = {10, 15, 25};
        int[] B = {1, 5, 20, 30};
        generateArr(A,B,1,1);
    }
    public static void generateArr(int[] arr,int[] arr2,int idx,int idx2){

        if(idx2 == arr2.length-1 || idx == arr.length-1){
            return;
        }
        if(arr[idx] > arr2[idx2] && arr2[idx2]>arr[idx-1]){
            System.out.println(arr[idx]+" "+arr2[idx2]+" "+arr[idx-1]);
            generateArr(arr,arr2,idx,idx2+1);
        }
        if(arr[idx] < arr2[idx2]){
            System.out.println(arr[idx]+" "+arr2[idx2]);
            generateArr(arr,arr2,idx+1,idx2);
        }
    }
}
