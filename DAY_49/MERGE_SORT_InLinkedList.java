package DataStructuresAlgorithm.DAY_49;

import DataStructuresAlgorithm.DAY1.Node;
import DataStructuresAlgorithm.DAY_48.LL;

import java.util.LinkedList;

public class MERGE_SORT_InLinkedList {
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
    public Node mergeSort(Node head){
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

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println(ll);
    }
    public Node merge(Node head1,Node head2){
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


}
