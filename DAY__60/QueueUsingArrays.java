package DataStructuresAlgorithm.DAY__60;

import java.util.Objects;

public class QueueUsingArrays {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        //-------isEmpty Function
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        //-----is full for circular queue
        public static boolean isFull(){
            return (rear+1)%size == front;//checking rear next element is front so it full
        }
        //-------add
        public static void add(int data){
            if(isFull()){
                System.out.println("Stack is Full");
                return;
            }
            //when adding first element
            if(front==-1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        //-----remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front];
            //when deleting last element (Edge case)
            if(front == rear){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }

        public static void main(String[] args) {
            Queue q = new Queue(3);
            q.add(1);
            q.add(2);
            q.add(3);
            System.out.println(q.remove());
            q.add(4);
            System.out.println(q.remove());
            q.add(5);
            //1 2 3  stack -> 3 2 1
            while(!q.isEmpty()){
                System.out.print(q.peek()+" ");
                q.remove();
            }
        }
    }
}
