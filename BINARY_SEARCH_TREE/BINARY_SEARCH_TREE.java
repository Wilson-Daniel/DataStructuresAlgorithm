package DataStructuresAlgorithm.BINARY_SEARCH_TREE;

import DataStructuresAlgorithm.DAY__91.BINARY_SEARCH_TREE_ALL_Revision;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class BINARY_SEARCH_TREE {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root,int value){
        if(root==null){
            root = new Node(value);
            return root;
        }
        if(root.data > value){
            root.left = insert(root.left,value);
        }
        if(root.data < value){
            root.right = insert(root.right,value);
        }
        return root;
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Node root=null;
        for(int i=0 ; i<arr.length ; i++){
            root = insert(root,arr[i]);
        }
        preOrder(root);
        System.out.println();
        System.out.println(search(root,5));
        delete(root,5);
        preOrder(root);
        System.out.println();
        ArrayList<Integer> ans = new ArrayList<>();
        rootToLeaf(root,ans);
    }
    public static boolean search(Node root,int val){
        if(root==null){
            return false;
        }
        if(root.data==val){
            return true;
        }
        if(root.data>val){
            return search(root.left,val);
        }else{
            return search(root.right,val);
        }
    }
    public static Node delete(Node root,int val){
        if(root==null){
            return null;
        }
        if(root.data > val){
            root.left = delete(root.left,val);
        }else if(root.data < val){
            root.right = delete(root.right,val);
        }else{
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
                Node IS = findInOrderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root,IS.data);
            }
        }
        return root;
    }
    public static Node findInOrderSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
    public static void rootToLeaf(Node root, ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
        rootToLeaf(root.left,path);
        rootToLeaf(root.right,path);
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer> ans){
        for(int i: ans){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
