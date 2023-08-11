package DataStructuresAlgorithm.STACK;

import java.util.Stack;

public class STACK_Palindrome_Linked_List {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(5);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        boolean condition = isPalindrome(one);
        System.out.println("Palindrome :" + condition);
    }
    public static boolean isPalindrome(Node head){
        Stack<Integer> s = new Stack<>();
        Node temp = head;
        while(temp!=null){
            s.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            if(temp.data != s.peek()){
                return false;
            }
            temp = temp.next;
            s.pop();
        }
        return true;
    }

}
