package DataStructuresAlgorithm.DAY__83;

import DataStructuresAlgorithm.DAY__82.BINARYTREE_Build_Tree_Preorder;

public class BINARYTREE_Height_of_a_Tree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        /*
               1
              / \
             2   3
           / \  / \
          4  5 6   7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Level of tree is: "+treeHeight(root));
        System.out.println("Number of Nodes: "+countNodes(root));
        System.out.println("Sum of Node: "+sum(root));
        System.out.println("Diameter of tree:(Optimized opp.) "+diameter(root).diam);
        /*
            2
           / \
          4   5
         */
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        System.out.println("Is a subtree of another tree: " + isSubtree(root,subRoot));
    }
    //height of a tree
    public static int treeHeight(Node root){
        if(root == null){
            return 0;
        }
        int lh = treeHeight(root.left);
        int rh = treeHeight(root.right);
        int height = Math.max(lh,rh)+1;
        return height;
    }
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        int totalNod = leftCount+rightCount+1;
        return totalNod;
    }
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        int totalsum = leftSum+rightSum+root.data;
        return totalsum;
    }
    //diameter
    public static int diameter2(Node root){
        if(root==null){
            return 0;
        }
        int ldiam = diameter2(root.left);
        int lheight = treeHeight(root.left);
        int rdiam = diameter2(root.right);
        int rheight = treeHeight(root.right);
        int selfDiam = lheight+rheight+1;

        return Math.max(ldiam,Math.max(rdiam,selfDiam));
    }
    //optimised diameter
    public static class Info{
        int diam;
        int ht;
        Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftinfo = diameter(root.left);
        Info rightinfo = diameter(root.right);

        int daim = Math.max(Math.max(leftinfo.diam,rightinfo.diam),leftinfo.ht+rightinfo.ht+1);
        int ht = Math.max(leftinfo.ht , rightinfo.ht) + 1;
        return new Info(daim,ht);
    }

    //SUBTREE OF ANOTHER TREE
    public static boolean isIdentical(Node node,Node subRoot){
        if(node == null && subRoot == null){
            return true;
        }else if(node==null || subRoot==null || node.data != subRoot.data){
            return false;
        }
        if(!isIdentical(node.left,subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right,subRoot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root, Node subRoot){
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        //this is optimised because if true in left then no need to travel in right part
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
}

