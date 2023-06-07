package DataStructuresAlgorithm.DAY__89;

public class BINARY_SEARCH_TREE_Making_Balances_BST_From_Sorted_Array {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {3,5,6,8,10,11,12};
        /*
                8
               / \
             5   10
           /  \    \
         3     6    11
        */
        Node root = createBST(arr,0, arr.length-1);
        preOrder(root);
    }
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

}
