package DataStructuresAlgorithm.DAY_52;
import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> ss = new Stack<>();
        ss.add(1);
        ss.add(2);
        ss.add(3);
        System.out.println("Original Stack: "+ss);
        reverse(ss);
        System.out.println("Reversed Stack: "+ss);
    }
    public static void reverse(Stack<Integer> ss){
        if(ss.isEmpty()){
            return;
        }
        int top = ss.pop();
        reverse(ss);
        pushAtBottom(ss,top);
    }
    public static void pushAtBottom(Stack<Integer> ss,int data){
        if(ss.isEmpty()){
            ss.push(data);
            return;
        }
        int top = ss.pop();
        pushAtBottom(ss,data);
        ss.push(top);
    }
}
