package DataStructuresAlgorithm.DAY__55;

import java.util.Stack;

public class STACK_DuplicateParentheses {
    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";
        String str1 = "((a+b))";
        System.out.println(duplParen(str));
        System.out.println(duplParen(str1));
    }
    public static boolean duplParen(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch==')'){
                int count =0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true; //duplicate
                }else{
                    s.pop();
                }
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }
}
