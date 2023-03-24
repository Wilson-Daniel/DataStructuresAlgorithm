package DataStructuresAlgorithm.DAY_45;

import DataStructuresAlgorithm.DAY1.Node;

public class LinkedList {
    Node head;
    Node tail;
    public static int size;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        //STEP-1
        Node newNode = new Node(data);
        size++;
        //BASE CASE
        if(head == null){
            head = tail =  newNode;
            return;
        }
        //STEP-2
        newNode.next = head;
        //STEP-3
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int data,int idx){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node neNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        neNode.next = temp.next;
        temp.next = neNode;
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
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        LinkedList l1 = new LinkedList();
        ll.addFirst(2);
        ll.addLast(34);
        ll.addLast(3);
        ll.addFirst(1);
        ll.add(5,3);
        ll.printList();
        System.out.println(ll.size);

        l1.printList();


    }



}
