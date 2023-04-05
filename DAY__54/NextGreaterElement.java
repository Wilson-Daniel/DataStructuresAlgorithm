package DataStructuresAlgorithm.DAY__54;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {7,9,1,5,4};
        Stack<Integer> s = new Stack<>();
        int nextGreator[] = new int[arr.length];

        for(int i=arr.length-1 ; i>=0 ;i--){
            //1 while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            //2 if-else
            if(s.isEmpty()){
                nextGreator[i] = -1;
            }else{
                nextGreator[i] = arr[s.peek()];
            }
            //push in s
            s.push(i);
        }
        for (int i:nextGreator){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
