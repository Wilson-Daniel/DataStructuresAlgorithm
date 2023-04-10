package DataStructuresAlgorithm.DAY__59;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "{[(([]]))]}";
        System.out.println(valid(str));
    }
    public static boolean valid(String str){
        Stack<Character> ss = new Stack<>();
        for(int i=0 ; i<str.length() ; i++){
            char ch  = str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                ss.push(ch);
            }else {
                if (ss.peek() == '[' && ch == ']'
                    || ss.peek() == '(' && ch == ')'
                    || ss.peek() == '{' && ch == '}') {
                    ss.pop();
                } else {
                    return false;
                }
            }
        }
        if(ss.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
