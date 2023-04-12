package DataStructuresAlgorithm.DAY__60;

public class QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Queue{
        static Node head = null;
        static Node tail = null;
        // isEmpty
        public static boolean isEmpty(){
            return head==null && tail == null;
        }
        // Adding a data
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next= newNode;
            tail = newNode;
        }
        // removing a data
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int val = head.data;
            if(tail==head){
                tail=head=null;
            }else {
                head = head.next;
            }
            return val;
        }
        // peek()
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }

        public static void main(String[] args) {
            Queue qq = new Queue();
            qq.add(2);
            qq.add(3);
            qq.add(4);
            while(!qq.isEmpty()){
                System.out.print(qq.peek()+" ");
                qq.remove();
            }
        }
    }
}
