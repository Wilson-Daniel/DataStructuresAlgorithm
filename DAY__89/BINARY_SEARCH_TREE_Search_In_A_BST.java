package DataStructuresAlgorithm.DAY__89;

public class BINARY_SEARCH_TREE_Search_In_A_BST {
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

    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7,8,9,10,6};
        Node root = null;

        for(int i=0 ; i<values.length ; i++){
            root = insert(root,values[i]);
        }
        System.out.println("FOUND: "+search(root,5));
    }
    //SEARCH IN A BINARY SEARCH TREE
    public static boolean search(Node root,int key){ //O(H)
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
}
