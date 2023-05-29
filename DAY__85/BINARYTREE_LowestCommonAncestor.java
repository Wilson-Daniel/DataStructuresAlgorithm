package DataStructuresAlgorithm.DAY__85;

public class BINARYTREE_LowestCommonAncestor {
    static class Node{
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
        ancestor(root,4,5,0,0);
    }
    public static void ancestor(Node root,int n1,int n2,int n1a,int n2a){
        if(root == null){
            return;
        }
        ancestor(root.left,n1,n2,n1a,n2a);
        if(root.data == n1){
            n1a = root.data;
        }
        ancestor(root.right,n1,n2,n1a,n2a);
        if(root.data == n1a){
            System.out.println(n1a);
            return;
        }


    }
}
