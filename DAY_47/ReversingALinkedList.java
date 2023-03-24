package DataStructuresAlgorithm.DAY_47;

public class ReversingALinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public void addData(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            head = newNode;
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public void reverseList(){
        Node previous = head;
        Node current = head.next;


        while(previous.next != null){
            previous=previous.next;
        }


    }

    public static void main(String[] args) {
        ReversingALinkedList ll = new ReversingALinkedList();
        ll.addData(2);
        ll.addData(3);
        ll.printList();
    }
}


