package DataStructuresAlgorithm.DAY_52;
import java.util.*;
public class PushAtBottom {
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        pushAtBottom(list,4);
        System.out.println(list);
    }
}
