package DataStructuresAlgorithm.DAY__88;

import DataStructuresAlgorithm.DAY__87.HeightOfATree;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        /*
                2
              /  \
             2    2
           /  \    \
          5   2     2
         */
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        //root.left.right = new Node(2);
        root.right.right = new Node(7);
        System.out.println(isUnivalTree(root));
        System.out.println(maxSum(root));
    }
    public static boolean isUnivalTree(Node root){
        if(root == null){
            return true;
        }
        if(root.left!=null && root.left.val!=root.val){
            return false;
        }
        if(root.right!=null && root.right.val!=root.val){
            return false;
        }
        if(isUnivalTree(root.left) && isUnivalTree(root.right)){
            return true;
        }
        return false;
    }

    public static int maxSum(Node root){
        if(root == null){
            return 0;
        }
        int leftNode = maxSum(root.left);
        int rightNode = maxSum(root.right);
        int sum = leftNode+ rightNode+root.val;
        return Math.max(Math.max(leftNode,rightNode),sum);
    }


}
