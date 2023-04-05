package DataStructuresAlgorithm.DAY__54;

import DataStructuresAlgorithm.DAY_50.LinkedList.*;
import DataStructuresAlgorithm.DAY_52.StackImp;

import javax.naming.InterruptedNamingException;
import java.util.Stack;

public class StackUsingLL {
    static Node head = null;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static boolean isEmpty(){
        return head==null;
    }
    public static void push(int data){
        Node newNode = new Node(data);
        if(head ==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static int pop(){
        if(head == null){
            return -1;
        }
        int x = head.data;
        head = head.next;
        return x;
    }
    public static int peek(){
        if(head == null){
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        StackUsingLL list = new StackUsingLL();
        list.push(2);
        list.push(3);
        list.push(6);
        list.push(8);
        list.pushAtBottom(list,9);
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        String ss = "abcg";
        System.out.println(reverseString(ss));
        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        stockspan(stocks,span);
        for(int i:span){
            System.out.print(i+" ");
        }


    }

    //--------------------------push at bottom--------------
    public static void pushAtBottom(StackUsingLL s, int data ){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    //------------------------reverse a string-----------------
    public static String reverseString(String ss){
        Stack<Character> s = new Stack<>();
        int idx=0;
        while(idx<ss.length()){
            char cc = ss.charAt(idx);
            s.add(cc);
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char cc = s.pop();
            result.append(cc);
        }
        return result.toString();
    }
    //-------------STOCK SPAN PROBLEM--------------------
    public static void stockspan(int[] stocks,int[] span){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i=1 ; i<stocks.length ; i++){
            int currPrice= stocks[i];
            while(!s.isEmpty() && currPrice>stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);
        }

    }
}
