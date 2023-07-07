package DataStructuresAlgorithm.TRIE;

import java.util.ArrayList;
import java.util.List;

public class TRIE_Word_Breaking_Problem {
    public static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0; i <26 ; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word,Node root){
        Node curr = root;
        for(int level=0 ; level<word.length() ; level++){
            int idx = word.charAt(level)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String key,Node root){
        Node curr = root;
        for(int level=0 ; level<key.length() ; level++){
            int idx = key.charAt(level)-'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }
    public static boolean wordBreak(String key,Node root){
        if(key.length()==0){
            return true;
        }
        for(int i=1 ; i<=key.length() ; i++){
            if(search(key.substring(0,i),root) && wordBreak(key.substring(i),root)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String arr[] = {"i","like","sam","samsung","mobile","ice"};
        for(int i=0 ; i<arr.length ; i++){
            insert(arr[i],root);
        }
        String key = "ilike";
        System.out.println(wordBreak(key,root));
        List<List<String>> ll= new ArrayList<>();

        System.out.println(ll.get(0).contains("e"));
    }
}
