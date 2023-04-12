package DataStructuresAlgorithm.DAY__60;

import java.util.Stack;

public class ImplementingQueueUsing2Stacks {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        public boolean isEmpty(){
            return s1.isEmpty();
        }
        //adding data
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        //remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return s1.pop();
        }

        public static void main(String[] args) {
            ImplementingQueueUsing2Stacks q = new ImplementingQueueUsing2Stacks();
            q.add(2);
            q.add(4);
            q.add(5);
            while(!q.isEmpty()){
                System.out.print(q.remove()+" ");
                
            }
        }

}
