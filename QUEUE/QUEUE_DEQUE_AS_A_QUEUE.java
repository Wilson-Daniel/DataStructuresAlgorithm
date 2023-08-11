package DataStructuresAlgorithm.QUEUE;

import java.util.Deque;
import java.util.LinkedList;

public class QUEUE_DEQUE_AS_A_QUEUE {
    static Deque<Integer> d = new LinkedList<>();
    public void add(int data){
        d.offerLast(data);
    }
    public int remove(){
        if(d.peekLast()==null){
            return -1;
        }
        return d.pollLast();
    }
    public int peek(){
        if(d.peekLast()==null){
            return -1;
        }
        return d.peekLast();
    }

    public static void main(String[] args) {
        QUEUE_DEQUE_AS_A_QUEUE dd = new QUEUE_DEQUE_AS_A_QUEUE();
        dd.add(3);
        dd.add(2);
        dd.add(1);
        System.out.println(dd.remove());
        System.out.println(dd.remove());
        System.out.println(dd.remove());
        System.out.println(dd.peek());
    }
}
