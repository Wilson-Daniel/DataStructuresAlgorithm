package DataStructuresAlgorithm.DAY__87;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class HeightOfATree {
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
              /  \
             2    3
           /  \    \
          4   5     6
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        Node rootc = new Node(-10);
        rootc.left = new Node(9);
        rootc.right = new Node(20);

        rootc.right.left = new Node(15);
        rootc.right.right = new Node(7);
        System.out.println("HEIGHT OF TREE: "+ treeHeigth(root));
        System.out.println("TOTAL NODES OF TREE: "+ countNodes(root));
        System.out.println("TOTAL SUM OF TREE: "+ sumNode(root));
        System.out.println("DIAMETER OF TREE (Way 1 O(n2) ): "+ diameter1(root));
        System.out.println("DIAMETER OF TREE (Way 2 O(n) ): "+ diameter2(rootc).diam);
        /*
             2
           /  \
         4     5
        */
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        System.out.println("ROOT IS A SUBROOT OF ANOTHER TREE: "+ subTree(root,subRoot));
        System.out.print("TOP VIEW OA A TREE: ");
        topView(root);
        System.out.println();
        System.out.print("Kth LEVEL OF TREE: ");
        kLevel(root,1,3);
        System.out.println();
        System.out.print("LOWEST COMMON ANCESTOR OF TREE: "+lca(root,4,6).data);
        System.out.println();
        System.out.print("LOWEST COMMON ANCESTOR OF TREE( WAY 2): "+lca2(root,4,6).data);
        System.out.println();
        System.out.println("MINIMUM DISTANCE B/W TWO NODES: "+minDist(root,4,6));

        System.out.print("Kth ancestor: ");
        kthAnc(root,2,5);
        /*
        for sum transformation tree
                1
              /  \
             2    3
           /  \  / \
          4   5 6   7
         */
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        root2.right.right = new Node(6);
        root2.right.left = new Node(7);
        transform(root2);
        System.out.print("Transform of Sum Tree: ");
        printTree(root2);


    }
    //---------------TREE HEIGHT----------------
    public static int treeHeigth(Node root){
        if(root == null){
            return 0;
        }
        int lh = treeHeigth(root.left);
        int rh = treeHeigth(root.right);
        return Math.max(lh,rh)+1;
    }
    //------------------------------------------
    //---------------COUNT NODES----------------
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return leftCount+rightCount+1;
    }
    //------------------------------------------
    //---------------SUM OF NODES----------------
    public static int sumNode(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumNode(root.left);
        int rightSum = sumNode(root.right);
        return leftSum+rightSum+root.data;
    }
    //------------------------------------------
    //---------------DIAMETER OF A TREE-------------
    //------------------- WAY 1------------------
    public static int diameter1(Node root){
        if(root == null){
            return 0;
        }
        int ld = diameter1(root.left);
        int lh = treeHeigth(root.left);
        int rd = diameter1(root.right);
        int rh = treeHeigth(root.right);
        int selfDiameter = lh+rh+1;
        return Math.max(Math.max(ld,rd),selfDiameter);
    }
    //---------------DIAMETER OF A TREE-------------
    //------------------- WAY 2------------------
    public static class Info{
        int diam;
        int ht;
        Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter2(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info ld = diameter2(root.left);
        Info rd = diameter2(root.right);
        int diam = Math.max(Math.max(ld.diam,rd.diam),ld.ht+rd.ht+1);
        int ht = Math.max(ld.ht,rd.ht)+1;
        return new Info(diam,ht);
    }
    //--------------------------------------------
    //---------------SUB-TREE OF A ANOTHER TREE-------------
    public static boolean subTree(Node root, Node subroot){
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        return subTree(root.left,subroot) || subTree(root.right,subroot);
    }
    public static boolean isIdentical(Node root, Node subroot){
        if(root==null && subroot==null){
            return true;
        }else if(root==null || subroot==null || root.data != subroot.data){
            return false;
        }
        if(!isIdentical(root.left,subroot.left)){
            return false;
        }
        if(!isIdentical(root.right, subroot.right)){
            return false;
        }
        return true;
    }
    //--------------------------------------------
    //---------------TOP VIEW OF A TREE-------------
    public static class Info2{
        Node node;
        int hd;
        Info2(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root){
        Queue<Info2> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();
        int min=0,max=0;
        q.add(new Info2(root,0));
        q.add(null);
        while(!q.isEmpty()){
            Info2 currObj = q.remove();
            if(currObj == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(currObj.hd)){
                    map.put(currObj.hd,currObj.node);
                }
                if(currObj.node.left != null){
                    q.add(new Info2(currObj.node.left,currObj.hd-1));
                    min = Math.min(min,currObj.hd-1);
                }
                if(currObj.node.right != null){
                    q.add(new Info2(currObj.node.right,currObj.hd+1));
                    max = Math.max(max,currObj.hd+1);
                }
            }
        }
        for(int i=min ; i<=max ; i++){
            System.out.print(map.get(i).data+" ");
        }
    }
    //--------------------------------------------
    //---------------Kth LEVEL OF A TREE-------------
    public static void kLevel(Node root, int level,int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data+" ");
            return;
        }
        kLevel(root.left,level+1,k);
        kLevel(root.right, level+1,k);
    }
    //--------------------------------------------
    //--------------LOWEST COMMON ANCESTOR-------------
    //------------------- WAY 1----------------------
    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);
        int i=0;
        for( ; i<path1.size() ; i++){
            if(path1.get(i)!= path2.get(i)){
                break;
            }
        }
        Node lca = path1.get(i-1);
        return lca;
    }
    private static boolean getPath(Node root, int n1, ArrayList<Node> path1) {
        if(root == null){
            return false;
        }
        path1.add(root);
        if(root.data == n1){
            return true;
        }
        boolean foundLeft = getPath(root.left,n1,path1);
        boolean foundRight = getPath(root.right,n1,path1);
        if(foundLeft || foundRight){
            return true;
        }
        path1.remove(path1.size()-1);
        return false;
    }
    //--------------LOWEST COMMON ANCESTOR-------------
    //------------------- WAY 2----------------------
    public static Node lca2(Node root,int n1,int n2){
        if(root == null || root.data==n1 || root.data==n2){
            return root;
        }
        Node leftLca = lca2(root.left,n1,n2);
        Node rightLca = lca2(root.right,n1,n2);

        if(leftLca == null){
            return rightLca;
        }
        if(rightLca == null){
            return leftLca;
        }
        return root;
    }
    //---------------------------------------------------------
    //--------------MINIMUM DISTANCE B/W TWO NODES-------------
    public static int minDist(Node root,int n1,int n2){
        Node lca = lca2(root,n1,n2);
        int dist1 = getDist(lca,n1);
        int dist2 = getDist(lca,n2);
        return dist1+dist2;
    }
    public static int getDist(Node root,int n1){
        if(root == null){
            return -1;
        }
        if(root.data == n1){
            return 0;
        }
        int leftDst = getDist(root.left,n1);
        int rightDst = getDist(root.right,n1);

        if(leftDst==-1 && rightDst==-1){
            return -1;
        }else if(rightDst == -1){
            return leftDst+1;
        }else{
            return rightDst+1;
        }
    }
    //------------------------------------------
    //--------------Kth Ancestor---------------
    public static int kthAnc(Node root,int k,int n){
        if(root==null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftcheck = kthAnc(root.left,k,n);
        int righchevk = kthAnc(root.right,k,n);
        if(leftcheck==-1 && righchevk==-1){
            return -1;
        }
        int max = Math.max(leftcheck,righchevk);
        if(max+1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }
    //---------------------------------------------------------
    //--------------TRANSFORM TO SUM OF TREE------------------
    public static int transform(Node root){
        if(root == null){
            return 0;
        }
        //root.data = root.left.data+root.right.data;
        int leftChild = transform(root.left);
        int righChild = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null? 0 : root.left.data;
        int newRight = root.right == null? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight + righChild;
        return data;
    }
    public static void printTree(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        printTree(root.left);
        printTree(root.right);
    }
}
