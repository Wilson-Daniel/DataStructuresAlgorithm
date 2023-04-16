package DataStructuresAlgorithm.DAY__63.Questions;

import DataStructuresAlgorithm.DAY__62.StackUsingDeque;

import java.util.Deque;
import java.util.LinkedList;

public class ImplementStackandQueueusingDeque {
    static class stack1{
        static Deque d = new LinkedList();

        public static void push(int data){
            d.addLast(data);
        }
        public static boolean isEmpty(){
            return d.size() == 0;
        }

        public static int pop(){
            if(d.isEmpty()){
                System.out.println("Deque is Empty");
                return -1;
            }
            return (int) d.removeLast();
        }
        public static int peek(){
            return (int)d.getLast();
        }

    }

    public static void main(String[] args) {
        stack1 ss = new stack1();
        ss.push(1);
        ss.push(2);
        ss.push(3);
        while(!ss.isEmpty()){
            System.out.print(ss.peek()+" ");
            ss.pop();
        }
    }
}
