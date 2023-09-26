package DataStructuresAlgorithm.BINARY_TREE;

import DataStructuresAlgorithm.DAY__60.QueueUsingLinkedList;

import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

public class FinalTimeBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int idx = -1;
    public static Node buildTree(int[] nodes){
        idx++;
        if(nodes[idx]==-1 || idx==nodes.length){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        FinalTimeBinaryTree binaryTree = new FinalTimeBinaryTree();
        Node root = binaryTree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(countNodes(root));
        System.out.println(height(root));
        System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);
        Node node = new Node(2);
        node.left = new Node(6);
        node.right = new Node(5);
        System.out.println(subTree(root,node));
        topView(node);
    }
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return leftCount+rightCount+1;
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int dleft = diameter(root.left);
        int lHeight = height(root.left);
        int dright = diameter(root.right);
        int rHeight = height(root.right);
        int selfDiam = lHeight+rHeight+1;
        return Math.max(dleft,Math.max(selfDiam,dright));
    }
    static class Info{
        int ht;
        int diam;
        Info(int ht,int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static Info diameter2(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info lInfo = diameter2(root.left);
        Info rInfo = diameter2(root.right);
        int diam = Math.max(lInfo.diam,Math.max(rInfo.diam,lInfo.ht + rInfo.ht+1));
        int ht = Math.max(lInfo.ht,rInfo.ht)+1;
        return new Info(diam,ht);
    }
    public static boolean subTree(Node root,Node subRoot){
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return subTree(root.left,subRoot) || subTree(root.right,subRoot);
    }
    public static boolean isIdentical(Node root,Node subRoot){
        if(root==null && subRoot==null){
            return true;
        }else if(root==null || subRoot==null || root.data!=subRoot.data){
            return false;
        }
        if(!isIdentical(root.left,subRoot.left)){
            return false;
        }
        if(!isIdentical(root.right,subRoot.right)){
            return false;
        }
        return true;
    }
    public static class Infoo{
        Node node;
        int hd;
        Infoo(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root){
        Queue<Infoo> q = new LinkedList<>();
        HashMap<Integer,Node> hm = new HashMap<>();
        int min=0,max=0;
        q.add(new Infoo(root,0));
        q.add(null);
        while(!q.isEmpty()){
            Infoo curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!hm.containsKey(curr.hd)){
                    hm.put(curr.hd,curr.node);
                }
                if(curr.node.left!=null){
                    q.add(new Infoo( curr.node.left,curr.hd-1));
                    //min = Math.min(min,curr.hd-1);
                }
                if(curr.node.right !=null){
                    q.add(new Infoo(curr.node.right,curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }
            for(int i=min ; i<=max ; i++){
                System.out.print(hm.get(i).data+" ");
            }
        }
    }


}
