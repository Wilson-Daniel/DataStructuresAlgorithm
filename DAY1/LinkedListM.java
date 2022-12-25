package DataStructuresAlgorithm.DAY1;

public class LinkedListM {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    void add(int data){
        Node toAdd = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = toAdd;
    }
    boolean isEmpty(){
        return head==null;
    }
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
