package DataStructuresAlgorithm.LINKED_LIST;

public class LINKED_LIST_Segregate_Even_Odd {
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

    public static Node segregate(Node head){
        Node evenLL = new Node(-1);
        Node temp = evenLL;
        Node oddLl = new Node(-1);
        Node temp2 = oddLl;
        while(head!=null){
            if(head.data%2==0){
                temp.next = head;
                temp = temp.next;
            }else{
                temp2.next = head;
                temp2 = temp2.next;
            }
            head= head.next;
        }
        temp.next = temp2;
        return evenLL.next;
    }
    public static void main(String[] args) {
        Node ll = new Node(1);
        ll.next = new Node(2);
        ll.next.next = new Node(3);
        ll.next.next.next = new Node(4);
        segregate(ll);
        printList(ll);

    }
    public static void printList(Node head){
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
