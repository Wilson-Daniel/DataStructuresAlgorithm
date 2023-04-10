package DataStructuresAlgorithm.DAY__59;

import java.util.ArrayList;

public class MakingStackWithArrayList {
    static ArrayList<Integer> list = new ArrayList<>();
    //size
    public static boolean isEmpty(){
        return list.size()==0;
    }
    public static void push(int data){
        list.add(data);
    }
    public static int pop(){
        if(list.isEmpty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    public static int peek() {
        int top = list.get(list.size() - 1);
        return top;
    }

    public static void main(String[] args) {
        MakingStackWithArrayList list = new MakingStackWithArrayList();
        list.push(3);
        list.push(5);
        list.push(7);
        while(!list.isEmpty()){
            System.out.println(list.pop());
        }
    }
}
