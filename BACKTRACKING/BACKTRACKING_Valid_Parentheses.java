package DataStructuresAlgorithm.BACKTRACKING;

import java.util.Stack;

public class BACKTRACKING_Valid_Parentheses {
    public static int getMinCnt(String str){
        Stack<Character> s = new Stack<>();
        for(int i= 0 ;i<str.length() ; i++){
            char ch= str.charAt(i);
            if(ch==')'){
                if(!s.isEmpty() && s.peek() == '(') {
                    s.pop();
                }else{
                    s.push(ch);
                }
            }else{
                s.push(ch);
            }
        }
        return s.size();
    }

    public static void main(String[] args) {
        System.out.println(getMinCnt("()))("));
    }
}
