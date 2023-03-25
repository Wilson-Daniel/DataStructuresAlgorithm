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
    //adding at first place
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
    //adding at the last
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
    //Adding in middle of list
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
    //Printing a List
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
        ll.removeFirst();
        ll.printList();
        ll.removeLast();
        ll.printList();
        System.out.println(ll.searchIter(34));
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return Integer.MAX_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(head == null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        //prev : i -> size-2
        Node prev = head;
        for(int i=0 ; i<size-2; i++){
            prev= prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int searchIter(int key){
        if(head == null){
            System.out.println("List is empty");
            return -1;
        }
        Node temp =head;
        int idx = 1;
        while(temp!= null){
            if(temp.data == key){
                return idx;
            }
            temp = temp.next;
            idx++;

        }
        return -1;
    }




}
