package DataStructuresAlgorithm.PRIORITY_QUEUE;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Implementation {
    public static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student S2){
            return this.rank - S2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        pq.add(3);//O(logn)
//        pq.add(5);
//        pq.add(2);
//        pq.add(1);
        pq.add(new Student("A",1));
        pq.add(new Student("B",5));
        pq.add(new Student("C",2));
        pq.add(new Student("D",12));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +" -> "+pq.peek().rank);//O(1)
            pq.remove();   //logn
        }

    }
}
