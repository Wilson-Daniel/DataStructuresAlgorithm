package DataStructuresAlgorithm.QUEUE;

import java.util.Deque;
import java.util.LinkedList;

public class QUEUE_DEQUEUE {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        Deque<Integer> deque1 = new LinkedList<>();
        deque1.offerLast(3);
        deque.addFirst(1);
        deque.add(2);
        deque.addLast(4);
        deque.add(5);
        deque.addFirst(3);
        while(!deque.isEmpty()){
            System.out.print(deque.removeFirst()+" ");
        }
    }
}
