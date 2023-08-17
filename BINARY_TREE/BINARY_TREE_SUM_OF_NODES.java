package DataStructuresAlgorithm.BINARY_TREE;

public class BINARY_TREE_SUM_OF_NODES {
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
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        BINARY_TREE_SUM_OF_NODES ss = new BINARY_TREE_SUM_OF_NODES();
        System.out.println(ss.sumNode(root));
    }
    public int sumNode(Node root){
        if(root==null){
            return 0;
        }
        int left = sumNode(root.left);
        int right = sumNode(root.right);
        return left+right+root.data;
    }


    public static class Info{
        int diam;
        int ht;
        Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
//    public static Info Diameter(Node root){
//
//        Info leftInfo = Diameter(root.right);
//
//    }

}
