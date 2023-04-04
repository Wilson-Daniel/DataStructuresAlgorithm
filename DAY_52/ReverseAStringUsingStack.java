package DataStructuresAlgorithm.DAY_52;
import java.util.Stack;
public class ReverseAStringUsingStack {
    public static void main(String[] args) {
        String ss = "Hello";
        String rev  = reverseString(ss);
        System.out.println("Reversed String is: "+rev);
    }
    public static String reverseString(String ss){
        Stack<Character> store = new Stack<>();
        int idx = 0;
        while(idx<ss.length()){
            store.add(ss.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!store.isEmpty()){
            char cc = store.pop();
            result.append(cc);
        }
       return result.toString();
    }
}
