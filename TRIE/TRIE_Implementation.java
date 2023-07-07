package DataStructuresAlgorithm.TRIE;

public class TRIE_Implementation {
    public static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0; i <26 ; i++){
                children[i] = null;
            }
        }
    }
    //-----------------------------------------
    public static Node root = new Node();
    //---------------------------------------------
    //-----------------INSERT----------------------
    public static void insert(String word){
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
    //---------------------------------------------
    //-----------------SEARCH----------------------
    public static boolean search(String key){
        Node curr = root;
        for(int level=0 ; level<key.length() ; level++){
            int idx = key.charAt(level)-'a';
            if(curr.children[idx] == null){
//                if(level==word.length()-1){
//                    if(curr.eow == false){
//                        return false;
//                    }
//                }
                return false;
            }
            curr = curr.children[idx];
        }
        //return true;
        return curr.eow == true;
    }

    public static void main(String[] args) {
        String words[] = {"the","a","there","their","any","thee"};
        for(int i=0 ; i< words.length ; i++){
            insert(words[i]);
        }
        System.out.println("Word Exist: "+search("any"));
        System.out.println("Word Exist: "+search("an"));
        System.out.println(check(root,""));
    }
    public static String check(Node curr,String ans){
        for(int i=0 ; i<26 ; i++){
            if(curr.children[i]!=null){
                ans+='a'-i;
                check(curr.children[i],ans);
            }
        }
        return ans;
    }

}
