package DataStructuresAlgorithm.DAY__64;

import java.util.Stack;

public class SortAStackusingRecursion {
    public static void sortRec(Stack<Integer> s,int x){
        if(s.size()==1){
            return;
        }
        int val = s.pop();
        sortRec(s,x);
        if(s.peek() > val){
            int temp = s.pop();
            s.push(val);
            s.push(temp);
        }else{
            s.push(val);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(100);
        s.push(-11);
        s.push(4);
        s.push(-7);
        s.push(9);
        sortRec(s,1);
        System.out.println(s);
    }
}
