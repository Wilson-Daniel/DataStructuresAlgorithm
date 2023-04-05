package DataStructuresAlgorithm.DAY__54;

import java.util.ArrayList;

public class StackUsingArray {
    static ArrayList<Integer> list = new ArrayList<>();
    public static boolean isEmpty(){
        return list.size()==0;
    }
    public static void push(int data){
        list.add(data);
    }
    public static int pop(){
        if(list.isEmpty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    public static int peek(){
        return list.get(list.size()-1);
    }

    public static void main(String[] args) {
        StackUsingArray ll = new StackUsingArray();
        System.out.println(ll.isEmpty());
        ll.push(3);
        ll.push(7);
        ll.push(10);
        System.out.println(ll.peek());
        System.out.println();
        System.out.println(ll.pop());
        System.out.println(ll.pop());
        System.out.println(ll.pop());
    }
}
