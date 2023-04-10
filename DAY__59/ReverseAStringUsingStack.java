package DataStructuresAlgorithm.DAY__59;

import java.util.Stack;

public class ReverseAStringUsingStack {
    public static String reverse(String s){
        Stack<Character> ss = new Stack<>();
        int i=0;
        while(i<s.length()){
            ss.push(s.charAt(i));
            i++;
        }
        StringBuilder resu = new StringBuilder();
        while(!ss.isEmpty()){
            resu.append(ss.pop());
        }
        return resu.toString();
    }

    public static void main(String[] args) {
        String s = "cba";
        System.out.println(reverse(s));
    }
}
