package DataStructuresAlgorithm.DAY_52;

import java.util.ArrayList;
import java.util.Stack;

public class StackImp {
    //------------------------------------ARRAYLIST STACK------------------
    static class AAStack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            if(isEmpty()){ //if stack is empty
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()){ //if stack is empty
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    //------------------------------------------------------------------------

    public static void main(String[] args) {
        AAStack ss = new AAStack();
        System.out.print("ArrayList STACK: ");
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);
        while(!ss.isEmpty()){
            System.out.print(ss.peek()+" ");
            ss.pop();
        }
        LLStack s = new LLStack();
        System.out.println(s.isEmpty());
        System.out.print("LinkedList STACK: ");
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
        System.out.println();
        //---------------------JAVA COLLECTION FRAMEWORK STACK------------
        Stack<Integer> list = new Stack<>();
        System.out.print("J C F STACK: ");
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        while(!list.isEmpty()){
            System.out.print(list.peek()+" ");
            list.pop();
        }

    }
    //-------------------------LINKED LIST STACK------------------
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class LLStack{
        static Node head = null;
        //isEmpty function
        public static boolean isEmpty(){
            return head==null;
        }
        //push
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    //-------------------------------------------------------------------------


}
