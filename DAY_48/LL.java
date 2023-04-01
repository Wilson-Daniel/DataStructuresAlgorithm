package DataStructuresAlgorithm.DAY_48;




import java.util.LinkedList;

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
    private Node findNode(Node head){
        Node slow = head;
        Node fast = head.next;
        while(head!=null && head.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args){

//        head = new Node(1);
//        Node temp  = new Node(2);
//        head.next = temp;
//        head.next.next = new Node(3);
//        head.next.next.next = temp;
//        System.out.println(isCycle());
//        removeCycle();
//        System.out.println(isCycle());
        LinkedList ll = new LinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println(ll);

    }
    public Node mergeSort(Node head){
        if(head == null || head.next==null){
            return head;
        }
        //find Mid
        Node mid = findNode(head);
        //left and right Node
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        //medge
        return merge(newLeft,newRight);
    }
    public Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1!=null && head2!=null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1!= null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2!=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
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
