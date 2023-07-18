package DataStructuresAlgorithm.PRIORITY_QUEUE;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PRIORITYQUEUE_Implementation {
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
//        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
////        pq.add(3);//O(logn)
////        pq.add(5);
////        pq.add(2);
////        pq.add(1);
//        pq.add(new Student("A",1));
//        pq.add(new Student("B",5));
//        pq.add(new Student("C",2));
//        pq.add(new Student("D",12));
//        while(!pq.isEmpty()){
//            System.out.println(pq.peek().name +" -> "+pq.peek().rank);//O(1)
//            pq.remove();   //logn
//        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
//        pq.add(3);//O(logn)
//        pq.add(5);
//        pq.add(2);
//        pq.add(1);
        pq.add(new Pair(5));
        pq.add(new Pair(54));
        pq.add(new Pair(548));
        pq.add(new Pair(60));

//        while(!pq.isEmpty()){
//            System.out.println(pq.peek().num);//O(1)
//            pq.remove();   //logn
//        }
        String[] arr = {"5","548","546","60"};
        System.out.println(printLargest(arr));

    }
    static String printLargest(String[] arr) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        for(int i=0 ; i<arr.length ; i++){
            pq.add(new Pair(Integer.parseInt(arr[i])));
        }
        String ans = "";

        while(!pq.isEmpty()){
            System.out.println(pq.peek().num);
            ans+=Integer.toString(pq.remove().num);
        }

        return ans;
        // code here
    }
    public static class Pair implements Comparable<Pair>{
        int num;
        Pair(int num){
            this.num = num;
        }
        @Override
        public int compareTo(Pair s2){
            String a = Integer.toString(this.num)+Integer.toString(s2.num);
            String b = Integer.toString(s2.num)+Integer.toString(this.num);
            int ai = Integer.parseInt(a);
            int bi = Integer.parseInt(b);
            if(ai<bi){
                return ai-bi;
            }else{
                return bi-ai;//6054854654
            }
        }
    }
}
