package DataStructuresAlgorithm.DAY__59;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        int[] nextGre = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1 ; i>=0 ; i--){
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGre[i] =  -1;
            }else{
                nextGre[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i:nextGre){
            System.out.print(i+ " ");
        }
    }
}
