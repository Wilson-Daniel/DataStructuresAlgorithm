package DataStructuresAlgorithm.STACK;



public class STACK_IMPLEMENTATION_LINKEDLIST {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    public static boolean isEmpty(){
        return head==null;
    }
    public static void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public static int peek(){
        return head.data;
    }
    public static int pop(){
        int top = head.data;
        head = head.next;
        return top;
    }

    public static void main(String[] args) {
        STACK_IMPLEMENTATION_LINKEDLIST ss = new STACK_IMPLEMENTATION_LINKEDLIST();
        ss.push(3);
        ss.push(6);
        ss.push(5);
        while(!ss.isEmpty()){
            System.out.print(ss.pop()+" ");
        }
    }
    //
}
