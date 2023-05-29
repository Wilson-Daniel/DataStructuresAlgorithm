package DataStructuresAlgorithm.DAY__84;

import DataStructuresAlgorithm.DAY__83.BINARYTREE_Height_of_a_Tree;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BINARYTREE_Top_View_Of_A_Tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
     /*
               1
              / \
             2   3
           / \  / \
          4  5 6   7
              /
             8
         */
    public static void main(String[] args) {
       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       //root.left.left = new Node(4);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.left = new Node(6);
       root.right.left.left = new Node(8);
       root.right.right = new Node(7);
       HashMap<Integer,Integer> map = new HashMap<>();
       int HD = 0;
       int min = 0;
       int max = 0;
       topViewM(root,map,HD,min,max);
       System.out.println(map);
       //shradha didi code, because doing by level order traversal
       topView(root);

    }
    public static void topViewM(Node root, HashMap<Integer,Integer> map,int HD,int min,int max){
        if(root== null){
            return;
        }
        if(map.get(HD) == null){
            map.put(HD,root.data);
//            min=HD;
//            max=HD;
        }
        topViewM(root.left,map,HD-1,min,max);
        topViewM(root.right,map,HD+1,min,max);
    }
    //shradha didi code, because doing by level order traversal
    static class Info{
        Node node;
        int hd;
        Info(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root,0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        for(int i=min; i<=max; i++){
            System.out.print(map.get(i).data +" ");
        }
    }
}
