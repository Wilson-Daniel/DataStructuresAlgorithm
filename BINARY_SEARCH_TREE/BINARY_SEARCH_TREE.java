package DataStructuresAlgorithm.BINARY_SEARCH_TREE;

import DataStructuresAlgorithm.DAY4.LargestOf3Digits;
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
        printInRange(root,2,6);
        System.out.println();
        System.out.println(isValidBST(root,null,null));
        createMirror(root);
        preOrder(root);
        System.out.println();
        int[] sortedArr = {3,5,6,8,10,11,12};
        Node Sroot = sortedArrayToBST(sortedArr,0,sortedArr.length-1);
        preOrder(Sroot);
        //balanceBST(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        Info ss = largestBST(root);
        System.out.println(ss.size);
    }
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }
    public static Node delete(Node root,int val){
        if(root==null){
            return null;
        }
        if(root.data<val){
            root.right = delete(root.right,val);
        }else if(root.data>val){
            root.left = delete(root.left,val);
        }else{
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                Node IS = findInOrderSuccessor(root);
                root.data = IS.data;
                root.right = delete(root.right,val);
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
    public static void rootToLeaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right== null){
            printPath(path);
        }
        rootToLeaf(root.left,path);
        rootToLeaf(root.right,path);
        path.remove(path.size()-1);
    }

    public static Node createMirror(Node root){
        if(root==null){
            return null;
        }
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);
        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }
    public static void printPath(ArrayList<Integer> ans){
        for(int i: ans){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.right,k1,k2);
        }else if(root.data>k1){
            printInRange(root.left,k1,k2);
        }else{
            printInRange(root.right,k1,k2);
        }
    }
    public static boolean isValidBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<min.data){
            return false;
        }
        if(max!=null && root.data>max.data){
            return false;
        }
        return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
    }
    //Sorted Array to BST
    public static Node sortedArrayToBST(int[] arr,int st,int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left = sortedArrayToBST(arr,st,mid-1);
        root.right = sortedArrayToBST(arr,mid+1,end);
        return root;
    }
    //BST To Balanced BST
    public static Node createBST(ArrayList<Integer> inorder,int st,int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder,st,mid-1);
        root.right = createBST(inorder,mid+1,end);
        return root;
    }
    public static Node balanceBST(Node root){
        ArrayList<Integer> inorder = new ArrayList<>();
        getInOrder(root,inorder);
        root = createBST(inorder,0,inorder.size()-1);
        return root;
    }

    public static void getInOrder(Node root,ArrayList<Integer> inorder){
        if(root==null){
            return;
        }
        getInOrder(root.left,inorder);
        inorder.add(root.data);
        getInOrder(root.right,inorder);
    }
    public static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
        Info(boolean isBST,int size,int min,int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static Info largestBST(Node root){
        if(root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size+rightInfo.size+1;
        int min = Math.max(root.data,Math.max(leftInfo.min,rightInfo.min));
        int max = Math.max(root.data,Math.max(leftInfo.max, rightInfo.max));
        if(root.data <= leftInfo.max || root.data>= rightInfo.min){
            return new Info(false,size,min,max);
        }
        if(leftInfo.isBST && rightInfo.isBST){
            return new Info(true,size,min,max);
        }
        return new Info(false,size,min,max);
    }

}
