package DataStructuresAlgorithm.DAY__59;

import java.util.Stack;

public class STACK_Q4_Trapping_Rain_Water {
    public static void main(String[] args) {
        int[] height = {7, 4, 0, 9};
        int n = height.length;
//        int sum=0;
//        Stack<Integer> s = new Stack<>();
//        Stack<Integer> sLeft = new Stack<>();
//        for(int i=arr.length-1; i>=0 ; i--){
//            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
//                s.pop();
//            }
//            if(s.isEmpty()){
//                s.push(i);
//                sLeft.push(arr[i]);
//                System.out.print(arr[i]+" ");
//            }else{
//                sLeft.push(arr[s.peek()]);
//
//                System.out.print(arr[i]+" ");
//            }
//        }
//        s = new Stack<>();
//        Stack<Integer> sRight = new Stack<>();
//        for(int i=0 ; i<n ; i++){
//            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
//                s.pop();
//            }
//            if(s.isEmpty()){
//                s.push(i);
//                sRight.push(i);
//            }else{
//                sRight.push(s.peek());
//            }
//        }
//        for(int i=n-1 ; i>=0 ; i--){
//            if(sLeft.peek()>sRight.peek()){
//                sum= sum+(arr[i]-sRight.peek());
//                System.out.println(arr[i]+ " " +sRight.peek()+" = "+sum);
//                sRight.pop();
//                sLeft.pop();
//            }else{
//                sum= sum+(arr[i]-sLeft.peek());
//                System.out.println(arr[i]+" "+ sLeft.peek()+" = "+sum);
//                sRight.pop();
//                sLeft.pop();
//            }
//
//        }
        Stack<Integer> stack = new Stack<>();
//        int n = height.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            while ((!stack.isEmpty()) && (height[stack.peek()] < height[i])) {
                int pop_height = height[stack.peek()];
                stack.pop();
                if (stack.isEmpty())
                    break;
                int distance = i - stack.peek() - 1;
                int min_height = Math.min(height[stack.peek()], height[i])
                        - pop_height;
                ans += distance * min_height;
            }
            stack.push(i);
        }


        System.out.println(ans);

    }
}
