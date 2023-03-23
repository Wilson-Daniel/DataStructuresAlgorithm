package DataStructuresAlgorithm.DAY_46.Assignment;

import DataStructuresAlgorithm.DAY1.Node;

import java.util.Scanner;

public class Q1 {
    /*
    Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
    Search for the number 7 & display its index
     */
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+ " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        Q1 linkList = new Q1();
        linkList.addFirst(1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int s = sc.nextInt();
        for(int i=0 ; i<s ; i++){
            int ss = sc.nextInt();
            linkList.addFirst(ss);
        }
        linkList.printList();
    }
    public int findElement(int data){
        if(head == null){
            System.out.println("Empty List");
            return 0;
        }
        int index = 0;
        Node currNode = head;
        while(currNode != null){
            index++;
            if(currNode.data == data){
                return index;
            }
            currNode = currNode.next;
        }
        return -1;
    }

}
