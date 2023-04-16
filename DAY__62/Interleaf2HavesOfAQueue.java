package DataStructuresAlgorithm.DAY__62;

import java.util.LinkedList;
import java.util.Queue;

public class Interleaf2HavesOfAQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
//        q.add(7);
//        q.add(8);
//        q.add(9);
//        q.add(10);
        interLeaf(q);
    }
    public static void interLeaf(Queue<Integer> q){
        Queue<Integer> q2 = new LinkedList<>();
        int size = q.size();
        for(int i=0 ; i<size/2 ; i++){
            q2.add(q.remove());
        }
        while(!q2.isEmpty()){
            q.add(q2.remove());
            int val = q.remove();
            q.add(val);
        }

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
