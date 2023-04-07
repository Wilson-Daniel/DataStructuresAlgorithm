package DataStructuresAlgorithm.DAY__56;

import java.util.Stack;

public class CheckForValidParentheses {
    public static void main(String[] args) {
        String str  = "({}][])";
        System.out.println(validParen(str));
    }
    public static boolean validParen(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }else {
                    if (s.peek() == '('&&ch == ')' || s.peek()=='['&&ch==']' || s.peek() == '{' && ch == '}') {
                        s.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
