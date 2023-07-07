package DataStructuresAlgorithm.TRIE;

import java.util.ArrayList;

public class TRIE_GFG_Question {
    static class Node{
        Node[] children = new Node[26];
        boolean eow = false;
        Node(){
            for(int i=0 ; i<26 ; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i=0 ; i<word.length() ; i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String word){
        Node curr = root;
        for(int i=0 ; i<word.length() ; i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }
    public static int wordBreak(String A, ArrayList<String> B )
    {
        //code here
        for(int i=0 ; i<B.size() ; i++){
            insert(B.get(i));
        }
        if(wordBreak1(A)){
            return 1;
        }else{
            return 0;
        }
    }
    public static boolean wordBreak1(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1 ; i<key.length() ; i++){
            if(search(key.substring(0,i)) && wordBreak1(key.substring(i))){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("i");
        ar.add("like");
        ar.add("sam");
        ar.add("samsung");
        ar.add("mobile");
        ar.add("ice");
        System.out.println(wordBreak("ilike",ar));
    }
}
