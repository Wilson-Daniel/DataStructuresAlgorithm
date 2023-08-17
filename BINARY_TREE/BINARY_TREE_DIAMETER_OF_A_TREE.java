package DataStructuresAlgorithm.BINARY_TREE;

public class BINARY_TREE_DIAMETER_OF_A_TREE {
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
        System.out.println(diameter(root));
        System.out.println(Diameter(root).diam);
    }
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDiam = diameter(root.left);
        int rightDiam = diameter(root.right);

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int selfDiam = leftHeight+rightHeight+1;
        return Math.max(leftDiam,Math.max(rightDiam,selfDiam));
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left,right)+1;
    }
    //APPROACH 2 - O(N)
    public static class Info{
        int diam;
        int ht;
        Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info Diameter(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo = Diameter(root.left);
        Info rightInfo  = Diameter(root.right);

        int diam = Math.max(leftInfo.diam,Math.max(rightInfo.diam, leftInfo.ht + rightInfo.ht+1));
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
        return new Info(diam,ht);
    }
}
