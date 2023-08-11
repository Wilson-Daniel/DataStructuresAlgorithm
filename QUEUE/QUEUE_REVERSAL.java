package DataStructuresAlgorithm.QUEUE;

import java.util.Stack;

public class QUEUE_REVERSAL {
    public static void main(String[] args) {
        System.out.println(reverseParentheses("abc(de)"));
    }
    public static String reverseParentheses(String s) {
        StringBuilder ans = new StringBuilder("");
        Stack<Character> ss = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            ss.push(ch);
        }
        while(ss.size()!=0){
            if(ss.peek()==')' || ss.peek()=='('){
                ss.pop();
                while(ss.size()!=0 && ss.peek()==')' || ss.peek()=='('){
                    ans.append(ss.pop());
                }
            }
        }
        return ans.toString();

    }
}
