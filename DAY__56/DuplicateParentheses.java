package DataStructuresAlgorithm.DAY__56;

import java.util.Stack;

public class DuplicateParentheses {
    public static void main(String[] args) {
        String str = "(((a+b)+(b+d)))";
        String str1 = "((a+b)+(b+c))";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));
    }
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch==')'){
                int count =0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
}
