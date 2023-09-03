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
        System.out.println();
        System.out.println(search(root,7));
    }
    public static void inOrder(Node root){
        if(root==null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static boolean search(Node root,int key){ //O(n)
        if(root==null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if (root.data > key) {
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }
    public static Node delete(Node root,int val){
        if(root==null){
            return null;
        }
        //step1 - search
        if(root.data < val){
            root.right = delete(root.right,val);
        }else if(root.data > val){
            root.left = delete(root.left,val);
        }else{
            //voila mill gta
            //case-1 leaf child
            if(root.left == null && root.right==null){
                return null;
            }
            //case-2 One child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            //case-3
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);

        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root=root.left;
        }
        return root;
    }
}
