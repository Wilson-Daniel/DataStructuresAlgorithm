package DataStructuresAlgorithm.DAY__57;

import DataStructuresAlgorithm.DAY1.Node;

import java.util.LinkedList;
import java.util.Stack;

public class Q1_PalindromeLinkedList {
    static class Node {
        char data;
        Node ptr;
        Node(char d){
            ptr = null;
            data = d;
        }
    }


    public static void main(String[] args) {
        Node one = new Node('A');
        Node two = new Node('B');
        Node three = new Node('C');
        Node four = new Node('D');
        Node five = new Node('C');
        Node six = new Node('B');
        Node seven = new Node('A');
        one.ptr = two;
        two.ptr = three;
        three.ptr = four;
        four.ptr = five;
        five.ptr = six;
        six.ptr = seven;
//        boolean condition = isPalin(one);
        //System.out.println("Palindrome :" + condition);
        //isPalin(ch);
        //Sloved on GFG another appr. - https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
    }
//    public static boolean isPalin(LinkedList<Character> ch){
//        int n = ch.size();
//        int mid = n/2;
//        Node temp = head;
//        int i=0;
//        Stack<Character> ss = new Stack<>();
//        while(i<mid){
//            ss.push(temp.data);
//            temp = temp.next;
//            i++;
//        }
//        i=mid;
//        while(i<n){
//            if(temp.data == ss.peek()){
//                ss.pop();
//                temp = temp.next;
//            }else{
//                return false;
//            }
//            i++;
//        }
//        return true;
//    }
}
