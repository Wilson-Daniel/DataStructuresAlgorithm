package DataStructuresAlgorithm.DAY__59;

import DataStructuresAlgorithm.DAY1.Node;
import DataStructuresAlgorithm.DAY_50.LinkedList;

//class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data=data;
//        this.next = null;
//    }
//}
public class MakingStackWithLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;

    public static boolean isEmpty(){
        return head==null;
    }
    public static void push(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static int pop(){
        if(head == null) {
            return -1;
        }
        int val  =head.data;
        head = head.next;
        return val;
    }
    public  static int peek(){
        if(head == null){
            return -1;
        }
        int val = head.data;
        return val;
    }

    public static void main(String[] args) {
        MakingStackWithLL ll  = new MakingStackWithLL();
        ll.push(4);
        ll.push(3);
        ll.push(8);
        while(!ll.isEmpty()){
            System.out.println(ll.pop());
        }
    }


}
