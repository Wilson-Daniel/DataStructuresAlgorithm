package DataStructuresAlgorithm.DAY__60;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class JCF_Queue {
    public static void main(String[] args) {
        //Queue<Integer> qq = new LinkedList<>();
        Queue<Integer> qq = new ArrayDeque<>();
        qq.add(2);
        qq.add(3);
        qq.add(4);
        while(!qq.isEmpty()){
            System.out.print(qq.peek()+" ");
            qq.remove();
        }
    }
}
