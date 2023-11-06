package DataStructuresAlgorithm.BINARY_TREE;



import java.lang.reflect.Array;
import java.util.ArrayList;

public class BINARY_TREE_LCA {
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
        //System.out.println(lca(root,4,7).data);
        System.out.println(lca2(root,4,7).data);
        System.out.println(minDist(root,4,6));
    }
    public static Node lca(Node root, int n1,int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);
        int i ;
        for(i=0 ;i<path1.size() && i< path2.size() ; i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        Node lca = path2.get(i);
        return lca;
    }
    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundLeft = getPath(root.left,n,path);
        boolean foundRight = getPath(root.right,n,path);

        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    //APPROACH 2
    public static Node lca2(Node root,int n1,int n2){
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        Node leftLca = lca2(root.left,n1,n2);
        Node rightLca = lca2(root.right,n1,n2);
        if(rightLca==null){
            return leftLca;
        }
        if(leftLca==null){
            return rightLca;
        }
        return root;
    }
    //MINIMUM DISTANCE B/W TWO NODES
    public static int minDist(Node root,int n1,int n2){
        Node lca  = lca2(root,n1,n2);
        int dist1 = lcaDist(lca,n1);
        int dist2 = lcaDist(lca,n2);
        return dist1+dist2;
    }
    public static int lcaDist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist = lcaDist(root.left,n);
        int rightDist = lcaDist(root.right,n);
        if(leftDist==-1 && rightDist==-1){
            return -1;
        }else if(rightDist == -1){
            return leftDist+1;
        }else{
            return rightDist+1;
        }
    }
}
