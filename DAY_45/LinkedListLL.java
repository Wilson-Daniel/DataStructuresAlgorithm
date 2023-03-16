package DataStructuresAlgorithm.DAY_45;

public class LinkedListLL {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next = null;
        }
    }
    //add - First, Last
    //adding in first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //adding in last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    //printing a list
    public void printList(){
        if(head == null){ //corner case
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedListLL list = new LinkedListLL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addLast("list");
        list.addFirst("ll");
        list.printList();
    }
}
