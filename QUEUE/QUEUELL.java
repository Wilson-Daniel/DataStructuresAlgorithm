package DataStructuresAlgorithm.QUEUE;

public class QUEUELL {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;
    static Node tail = null;

    public boolean isEmpty(){
        return head==null && tail==null;
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public int remove(){
        if(head ==null){
            return -1;
        }
        int val = head.data;
        if(head==tail){
            head = tail = null;
        }else {
            head = head.next;
        }
        return val;
    }
    public int peek(){
        if(head==null){
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        QUEUELL q = new QUEUELL();
        q.add(1);
        q.add(2);
        q.remove();

        System.out.println(q.peek());

    }
}
