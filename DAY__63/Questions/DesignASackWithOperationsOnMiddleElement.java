package DataStructuresAlgorithm.DAY__63.Questions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class DesignASackWithOperationsOnMiddleElement {
    static class midStack{
        Stack<Integer> s;
        Deque<Integer> dq;
        midStack(){
            s = new Stack<>();
            dq = new LinkedList<>();
        }
        public void add(int data){
            dq.addLast(data);
            if(dq.size()>s.size()+1){
                int temp = dq.pollFirst();
                s.push(temp);
            }
        }
        public void pop(){
            int data = dq.pollLast();
            if(s.size()>dq.size()){
                int temp = s.pop();
                dq.offerFirst(temp);
            }
        }
        public int getMiddleElement(){
            return dq.getFirst();
        }
        public void deleteMiddleElement(){
            int data = dq.pollFirst();
            if(s.size()>dq.size()){
                int temp = s.pop();
                dq.offerFirst(temp);
            }
        }

    }

    public static void main(String[] args) {
//        Deque d = new LinkedList();
//        d.addLast(1);
//        d.addLast(12);
//        d.addLast(13);
//        System.out.println(d.pollFirst());
//        System.out.println(d.offerFirst(1));
//        System.out.println(d.offerFirst(1));
//        System.out.println(d);
        midStack s = new midStack();
        s.add(2);
        s.add(5);

        System.out.println("Middle element:"
                + s.getMiddleElement());
        s.add(3);
        s.add(7);
        s.add(4);
        System.out.println("Middle element:"
                + s.getMiddleElement());
        s.deleteMiddleElement();
        System.out.println("Middle element:"
                + s.getMiddleElement());
        s.deleteMiddleElement();
        System.out.println("Middle element:"
                + s.getMiddleElement());
        s.pop();
        s.pop();
        s.deleteMiddleElement();
    }
}
