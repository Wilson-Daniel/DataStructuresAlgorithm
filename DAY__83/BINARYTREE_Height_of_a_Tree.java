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
        System.out.println(sum(root));
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
}
