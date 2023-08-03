package DataStructuresAlgorithm.LINKED_LIST;

public class LINKED_LIST_Sort_A_LinkedList {
    static LinkedList.Node head;
    static LinkedList.Node tail;
    static  int size;
    public static class Node{
        int data;
        LinkedList.Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void sort(Node head){
        int[] arr = {0,1,2};
        Node temp = head;
        while(temp !=null){
            arr[temp.data] ++;
        }
    }
    public static void main(String[] args) {

    }
}
