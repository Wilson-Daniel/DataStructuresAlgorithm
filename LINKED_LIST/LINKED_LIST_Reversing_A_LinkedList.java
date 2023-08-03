package DataStructuresAlgorithm.LINKED_LIST;

public class LINKED_LIST_Reversing_A_LinkedList {
    static Node head;
    static Node tail;
    static  int size;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(6);
        ll.addLast(7);
        ll.add(3,5);
        ll.printList();
        reverse();
        ll.printList();


    }

    public static void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void printList(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }
}
