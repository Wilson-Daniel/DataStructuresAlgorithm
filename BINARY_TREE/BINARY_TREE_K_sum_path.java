package DataStructuresAlgorithm.BINARY_TREE;

import DataStructuresAlgorithm.DAY1.Node;

import java.util.ArrayList;

public class BINARY_TREE_K_sum_path {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left = null;
            this.right = null;
        }
    }
    public static int sumK(Node root, int k)
    {
        // code here
        int count=0;
        printKPathUtil(root,k,count);
        return count;

    }
    static ArrayList<Integer> path = new ArrayList<>();
    static void printKPathUtil(Node root, int k,int count)
    {
        // empty node
        if (root == null)
            return;

        // add current node to the path
        path.add(root.data);

        // check if there's any k sum path
        // in the left sub-tree.
        printKPathUtil(root.left, k,count);

        // check if there's any k sum path
        // in the right sub-tree.
        printKPathUtil(root.right, k,count);

        // check if there's any k sum path that
        // terminates at this node
        // Traverse the entire path as
        // there can be negative elements too
        int f = 0;
        for (int j = path.size() - 1; j >= 0; j--) {
            f += path.get(j);

            // If path sum is k, print the path
            if (f == k)
                count++;
        }

        // Remove the current element from the path
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(1);
        root.left.right.left = new Node(1);
        root.right = new Node(-1);
        root.right.left = new Node(4);
        root.right.left.left = new Node(1);
        root.right.left.right = new Node(2);
        root.right.right = new Node(5);
        root.right.right.right = new Node(2);

        int k = 5;
        int count= sumK(root, k);
        System.out.println(count);
    }
}
