package DataStructuresAlgorithm.QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class QUEUE {
    static int arr[];
    static int size;
    static int rear;
    QUEUE(int n){
        arr = new int[n];
        size = n;
        rear = -1;
    }
    public boolean isEmpty(){
        return rear==-1;
    }
    public void add(int data){
        if(rear==size){
            return;
        }
        rear = rear+1;
        arr[rear] = data;
    }

    public int remove(){
        if(isEmpty()){
            return -1;
        }
        int front = arr[0];
        for(int i=0 ; i<rear ; i++){
            arr[i] = arr[i+1];
        }
        rear = rear-1;
        return front;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[0];
    }

    public static void main(String[] args) {
        QUEUE q = new QUEUE(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out .println(q.remove());
        System.out .println(q.remove());
        System.out .println(q.remove());
        System.out .println(q.remove());
        Queue<Integer> qq =  new LinkedList<>();
        qq.poll();
        System.out.println(qq.poll());
    }
}
