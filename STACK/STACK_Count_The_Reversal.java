package DataStructuresAlgorithm.STACK;

import java.util.Stack;

public class STACK_Count_The_Reversal {
    static int countRev (String s)
    {
        // your code here
        Stack<Character> ss = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(!ss.isEmpty() && ch == '}' && ss.peek()=='{'){
                ss.pop();
            }else{
                ss.push(ch);
            }
        }
//        while(!ss.isEmpty()){
//            System.out.print(ss.peek()+" ");
//            ss.pop();
//        }
        int count = 0;
        while(!ss.isEmpty()){
            char ch = ss.pop();
            if(ch=='}' && ss.peek()=='}' || ch=='{' && ss.peek()=='{' ||
                    ch=='}' && ss.peek()=='{'){
                count++;
                ss.pop();
            }
        }


        return count;
    }

    public static void main(String[] args) {
        System.out.println(countRev("}}}}"));
    }
}
