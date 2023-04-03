package DataStructuresAlgorithm.DAY_51;

import DataStructuresAlgorithm.DAY1.Node;

import java.util.LinkedList;

public class Delete_Without_Head {
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(3);
        ll.add(2);
        ll.add(6);
        ll.add(5);
        ll.add(11);
        ll.add(10);
        ll.add(15);
        ll.add(12);

    }
    public void delNode(Node head){
        Node curr = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            if(curr.data>next.data){
                curr = null;
                curr = next;
            }
            curr = curr.next;
        }
    }
}
