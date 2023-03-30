package DataStructuresAlgorithm.DAY_50;

public class DoublyLinkedList {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            newNode.next = newNode.prev= null;
        }
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        newNode.prev = temp;
        System.out.println(newNode.prev.data);

    }
    public void printlist(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(6);
        dll.addFirst(2);
        dll.addFirst(34);
        dll.printlist();
        dll.removeFirst();
        dll.printlist();
        System.out.println(dll.size) ;
        dll.reverse();
        dll.printlist();
        dll.addLast(356);
        dll.printlist();
        dll.removeLast();
        dll.printlist();
        System.out.println(dll.size) ;

    }

    public int removeFirst(){
        if(head == null){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int removeLast(){
        if(head == null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node temp = head;
        for(int i=0 ; i<size-2 ; i++){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        return val;
    }


    public void reverse(){
        if(head == null){
            System.out.println("LL is empty");
            return ;
        }
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
