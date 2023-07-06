package DataStructuresAlgorithm.TRIE;

public class TRIE_Prefix_Problem {
    public static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        int frequency = 0;

        Node(){
            for(int i=0; i <26 ; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int level=0 ; level<word.length() ; level++){
            int idx = word.charAt(level)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
                curr.frequency = 1;
            }
            curr = curr.children[idx];
            curr.frequency++;
        }
        curr.eow = true;
    }
    public static String search(String key){
        Node curr = root;
        StringBuilder ans = new StringBuilder();
        for(int level=0 ; level<key.length() ; level++){
            int idx = key.charAt(level)-'a';
            if(curr.children[idx].frequency == 1 ){
                ans.append(key.charAt(level));
                return ans.toString();
            }else{
                ans.append(key.charAt(level));
            }
            curr = curr.children[idx];
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"zebra","dog","duck","dove"};
        for(int i=0 ; i<arr.length ; i++){
            insert(arr[i]);
        }
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(search(arr[i]));
        }
    }
}
