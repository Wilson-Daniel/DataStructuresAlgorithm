package DataStructuresAlgorithm.DAY__63;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queue {
    static class stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }
        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = -1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void main(String[] args) {
        stack ss = new stack();
        ss.push(1);
        ss.push(2);
        ss.push(3);
        while(!ss.isEmpty()){
            System.out.println(ss.pop());
        }
    }

}
