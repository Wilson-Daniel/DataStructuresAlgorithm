package DataStructuresAlgorithm.DAY_45;

public class LinkedListLL {
    Node head;
    private int size;
    LinkedListLL(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next = null;
            size++;
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
        list.addFirst("ll");
        list.printList();

        list.delFirst();
        list.printList();

        list.delLast();
        list.printList();

        System.out.println(list.getSize());
        list.addLast("list");
        System.out.println(list.getSize());

    }

    //deleting a node
    //deleteFirst
    public void delFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }
    public void delLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){ //        <-|    corner case handle
            head = null;               //  |
            return;                    //  |
        }                              //  |
        Node secondLast = head;        //  |
        Node lastNode = head.next; //head.next = null -> lastNode = Null;
        while(lastNode.next != null ){ //null.next !!error!!
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }
}
