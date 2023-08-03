package DataStructuresAlgorithm.LINKED_LIST;

public class DOUBLE_LINKED_LIST {
    public static Node head;
    public static Node tail;
    public static int size;

    public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head= tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = newNode;
            newNode.next = newNode.prev = null;
        }
        Node temp = head;
        while(temp.next!=null){
            temp =temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        newNode.prev = temp;
    }
    public void printAll(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public int removeFirst(){
        if(head==null){
            System.out.println("Empty");
            return -1;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }

    public static void main(String[] args) {
        DOUBLE_LINKED_LIST dd = new DOUBLE_LINKED_LIST();
        dd.addFirst(1);
        dd.addFirst(2);
        dd.addLast(3);
        dd.addLast(4);
        dd.printAll();
        dd.removeFirst();
        dd.printAll();
        Node revHead = dd.reverseDLL();
        dd.printAll(revHead);
        //System.out.println(dd);
    }
    public Node reverseDLL(){
        if(head==null){
            return null;
        }
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void printAll(Node head){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
