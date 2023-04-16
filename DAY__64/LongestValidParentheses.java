package DataStructuresAlgorithm.DAY__64;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String str="()(((()()()(()";
        System.out.println(maxLength(str));
    }
    static int maxLength(String S){
        // code here
        int ans =0;
        Stack<Character> charst = new Stack<>();
        Stack<Integer> indst = new Stack<>();
        indst.push(-1);
        for(int i=0 ; i<S.length() ; i++){
            char ch = S.charAt(i);
            if(ch==')' && charst.size()==0){
                indst.push(i);
            }else if(ch==')' && charst.size()>0){
                charst.pop();
                indst.pop();
                ans = Math.max(i-indst.peek(),ans);
            }else if(ch=='('){
                charst.push(ch);
                indst.push(i);
            }
        }
        return ans;
    }
}
