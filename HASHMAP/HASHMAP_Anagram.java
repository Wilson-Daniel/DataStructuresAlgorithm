package DataStructuresAlgorithm.HASHMAP;

import java.util.HashMap;

public class HASHMAP_Anagram {
    public static void main(String[] args) {
        String s = "tulip", t = "lipit";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> ss = new HashMap<>();

        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            ss.put(ch,ss.getOrDefault(ch,0)+1);
        }
        for(int i=0 ; i<t.length() ; i++){
            char ch = t.charAt(i);
            if(ss.get(ch)!=null){
                if(ss.get(ch)==1){
                    ss.remove(ch);
                }else{
                    ss.put(ch,ss.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return ss.isEmpty();


    }
}
