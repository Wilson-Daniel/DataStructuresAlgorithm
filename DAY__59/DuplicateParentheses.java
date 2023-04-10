package DataStructuresAlgorithm.DAY__59;

import java.util.Stack;

public class DuplicateParentheses {
    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";
        System.out.println(duplicate(str));
    }
    public static boolean duplicate(String str){
        Stack<Character> ss = new Stack<>();
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch==')'){
                int count = 0;
                while(ss.peek()!='('){
                    ss.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    ss.pop();
                }
            }else{
                ss.push(ch);
            }
        }
        return false;
    }
}
