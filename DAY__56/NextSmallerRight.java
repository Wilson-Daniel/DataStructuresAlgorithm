package DataStructuresAlgorithm.DAY__56;

import java.util.Stack;

public class NextSmallerRight {
    public static void main(String[] args) {
        int[] arr = {9,5,7,2,3};
        Stack<Integer> s = new Stack<>();
        int[] nextSmaller = new int[arr.length];
        for(int i= arr.length-1; i>=0 ; i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmaller[i] = -1;
            }else{
                nextSmaller[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i:nextSmaller){
            System.out.print(i+" ");
        }
    }
}
