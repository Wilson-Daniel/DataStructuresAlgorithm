package DataStructuresAlgorithm.DAY__62;

import java.util.LinkedList;
import java.util.Deque;

public class StackUsingDeque {
    static class stack{
        static Deque<Integer> d = new LinkedList<>();
        public static boolean isEmpty(){
            return d.size() == 0;
        }
        public static void push(int data){
            d.addLast(data);
        }

        public static int pop(){
            if(d.isEmpty()){
                System.out.println("Deque is Empty");
                return -1;
            }
            return d.removeLast();
        }
        public static int peek(){
            if(d.isEmpty()){
                System.out.println("Deque is Empty");
                return -1;
            }
            return d.getLast();
        }

    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
        System.out.println();
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("peek = "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
    static class queue{
        static Deque<Integer> d = new LinkedList<>();
        public void add(int data){
            d.addLast(data);
        }
        public int remove(){
            return d.removeFirst();
        }
        public int peek(){
            return d.getFirst();
        }
    }
}
