package DataStructuresAlgorithm.DAY__59;

import java.util.Stack;

public class PushAtBottomOfStack {

    public static void main(String[] args) {
        Stack<Integer> ss = new Stack<>();
        ss.push(3);
        ss.push(5);
        ss.push(6);
        pushAtbottom(ss,9);
        System.out.println(ss);
    }
    public static void pushAtbottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtbottom(s,data);
        s.push(top);
    }
}
