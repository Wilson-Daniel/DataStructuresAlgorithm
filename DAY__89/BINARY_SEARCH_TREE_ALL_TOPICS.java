package DataStructuresAlgorithm.DAY__89;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class BINARY_SEARCH_TREE_ALL_TOPICS {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
//            this.left = null;
//            this.right = null;
        }
    }
    //--------------MAKING A BINARY SEARCH TREE------------
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left,val);
        }else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    //----------------------------------------------------
    public static void main(String[] args) {
        int[] values = {8,9,3,1,4,5,6,2};
        Node root = null;
        for(int i=0 ; i<values.length ; i++){
            root = insert(root,values[i]);
        }
        inorder(root);
//        System.out.println("FOUND: "+search(root,7));
//        root = delete(root,7);
//        inorder(root);
        System.out.println();
        printINRange(root,1,8);
        System.out.println();
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println("PATH ARE: ");
        rootTOLeaf(root,ans);
        System.out.println("IS A VALID BST: "+isValidBst(root,null,null));

    }
    //-----------------------------------------------------------
    //----------------SEARCH IN A BINARY SEARCH TREE--------------
    public static boolean search(Node root, int key){ //O(H)
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }
    //-----------------------------------------------------------
    //----------------DELETE NODE IN A BINARY SEARCH TREE--------------
    public static Node delete(Node root,int val){
        //step 1 - search
        if(root.data < val){
            root.right = delete(root.right,val);
        }else if(root.data > val){
            root.left = delete(root.left,val);
        }else{//voila
            //case 1 - leaf child
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2 - One child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            //case 3- both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data; //value replace
            root.right = delete(root.right,IS.data);//right subtree mei jake IS vli node ko kr dia delete...change ayga right subtree mei toh root.right=.... keya hy
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    //-----------------------------------------------------------
    //----------------PRINT IN RANGE IN A BST--------------
    public static void printINRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printINRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printINRange(root.right,k1,k2);
        }else if(root.data < k1){
            printINRange(root.left,k1,k2);
        }else{
            printINRange(root.right,k1,k2);
        }
    }
    //-----------------------------------------------------------
    //----------------ROOT TO LEAF PATH IN BST--------------
    public static void rootTOLeaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return ;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
        rootTOLeaf(root.left,path);
        rootTOLeaf(root.right,path);
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i=0 ; i<path.size() ; i++){
            System.out.print(path.get(i)+" -> ");
        }
        System.out.println("Null");
    }
    //----------------------------------------------------------------
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    //-----------------------------------------------------------
    //----------------VALID BST--------------
    public static boolean isValidBst(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }else if(max!=null && root.data>=max.data){
            return false;
        }
        return isValidBst(root.left,min,root)
                && isValidBst(root.right,root,max);
    }

}
