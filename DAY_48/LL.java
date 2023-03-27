package DataStructuresAlgorithm.DAY_48;
import java.util.LinkedList;
import DataStructuresAlgorithm.DAY1.Node;

public class LL {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args){

        head = new Node(1);
        Node temp  = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;//+1
            fast = fast.next.next;//+2
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle= true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        //find meeting point
        slow = head;
        Node prev =null; //last node
        while(fast != slow){
            prev = fast;
            slow = slow.next;//+1
            fast = fast.next;//+1
        }
        //removing cycle - lastnode.next = null
        prev.next = null;
    }

}
