package DataStructuresAlgorithm.DAY__56;

import java.util.Stack;

public class NextGreaterLeft {
    public static void main(String[] args) {
        int[] arr = {9,5,7,2,3};
        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i:nextGreater){
            System.out.print(i+" ");
        }
    }
}
