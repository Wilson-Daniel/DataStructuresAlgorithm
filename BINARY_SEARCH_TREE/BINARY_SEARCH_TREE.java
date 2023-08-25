package DataStructuresAlgorithm.BINARY_SEARCH_TREE;

import DataStructuresAlgorithm.DAY__91.BINARY_SEARCH_TREE_ALL_Revision;

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
        if(root.data>value){
            root.left = insert(root.left,value);
        }
        if(root.data<value){
            root.right = insert(root.right,value);
        }
        return root;
    }

    public static void main(String[] args) {
        int value[] = {5,1,3,4,6,7};
        Node root = null;
        for(int i=0 ; i<value.length ; i++){
            root =  insert(root,value[i]);
        }
        inOrder(root);
    }
    public static void inOrder(Node root){
        if(root==null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
}
