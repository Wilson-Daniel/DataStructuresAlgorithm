package DataStructuresAlgorithm.DAY__91;

import java.util.ArrayList;

public class BINARY_SEARCH_TREE_ALL_Revision {
    static  class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    //-----------------------------------------------------------
    //-----------------------BUILDING BST-------------------------
    public static Node buildBST(Node root,int value){
        if(root==null){
            root = new Node(value);
            return root;
        }
        if(root.data>value){
            root.left = buildBST(root.left,value);
        }
        if(root.data<value){
            root.right = buildBST(root.right,value);
        }
        return root;
    }
    //-----------------------------------------------------------
    //-----------------------SEARCH A BST-------O(H)------------------
    public static boolean search(Node root,int key){
        if(root==null){
            return true;
        }
        if(root.data == key){
            return true;
        }
        if(key < root.data){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }
    //-----------------------------------------------------------
    //-----------------------DELETE A BST-------------------------
    public static Node delete(Node root, int val){
        if(val<root.data){
            root.left = delete(root.left,val);
        }else if(val>root.data){
            root.right = delete(root.right,val);
        }else{
            //found
            // step 2 - delete node
            //case 1 - child Node
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2 - one node
            if(root.left == null){
                return root.right;
            }else if(root.right ==null){
                return root.left;
            }
            //case 3 - two child
            Node IS = findSuccessor(root.right);
            root.data  = IS.data;
            root.right = delete(root.right,IS.data);
        }
        return root;
    }
    public static Node findSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
    //-----------------------------------------------------------
    //-----------------------PRINT IN RANGE-------------------------
    public static void printInRange(Node root,int k1,int k2){
        if(root ==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.right,k1,k2);
        }else if(root.data > k1){
            printInRange(root.left ,k1,k2);
        }else{
            printInRange(root.right,k1,k2);
        }
    }
    //-----------------------------------------------------------
    //-----------------------ROOT TO LEAF PATH------------------------
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
    public static void printPath(ArrayList<Integer> path){
        for(int i=0 ; i<path.size() ; i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }
    //-----------------------------------------------------------
    //-----------------------VALID BST------------------------
    public static boolean isValidBst(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        if(max!=null && root.data>=max.data){
            return false;
        }
        return isValidBst(root.left,min,root) && isValidBst(root.right,root,max);
    }
    //-----------------------------------------------------------
    //-----------------------MIRROR A BST----O(n)--------------------
    public static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node leftMirror = mirror(root.left);
        Node rightMirror = mirror(root.right);
        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }
    //-----------------------------------------------------------
    //---------SORTED ARRAY TO BALANCED BST----O(n)--------------
    public static Node createBST(int[] arr,int st,int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr,st,mid-1);
        root.right = createBST(arr,mid+1,end);
        return root;
    }
    //-----------------------------------------------------------
    //---------SIZE OF LARGEST BST IN BINARY TREE----O(n)--------------
    public static class Info{
        boolean isBst;
        int size;
        int min;
        int max;
        Info(boolean isBst , int size,int min ,int max){
            this.isBst = isBst;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static Info largesBST(Node root){
        if(root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info leftInfo = largesBST(root.left);
        Info rightInfo = largesBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max = Math.max(root.data,Math.max(leftInfo.max, rightInfo.max));
        if(root.data<=leftInfo.max || root.data>= rightInfo.min){
            return new Info(false,size,min,max);
        }
        if(leftInfo.isBst && rightInfo.isBst){
            return new Info(true,size,min,max);
        }
        return new Info(false,size,min,max);
    }

    public static void main(String[] args) {
        int[] values = {3,1,5,4,2,6};
        Node root = null;
        for(int i=0 ; i<values.length ; i++){
            root = buildBST(root,values[i]);
        }
        System.out.print("Build BST: ");
        inOrder(root);
        System.out.println();
        System.out.println("Search for Key 5: "+search(root,5));
//        delete(root,5);
        System.out.print("Deleting Node 5: ");
        inOrder(root);
        System.out.println();
        System.out.print("Print in Range 2-6: ");
        printInRange(root,2,6);
        System.out.println();
        System.out.println("TOTAL ROOT TO LEAF PATHS :");
        rootToLeaf(root,new ArrayList<>());
        System.out.println("Is valid BST: "+ isValidBst(root,null,null));
        mirror(root);
        System.out.print("Creating mirror of BST: ");
        inOrder(root);
        System.out.println();
        int[] arr = {3,5,6,8,10,11,12};
        Node rootarr = createBST(arr,0,arr.length-1);
        System.out.print("BST created from array: ");
        inOrder(rootarr);
        System.out.println();
        System.out.println("LARGEST BST IN A BINARY TREE: "+ largesBST(root).size);
    }
    //-----------------------------------------------------------
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
}
