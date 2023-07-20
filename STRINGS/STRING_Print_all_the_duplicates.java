package DataStructuresAlgorithm.STRINGS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class STRING_Print_all_the_duplicates {
    public static void printDups(String str){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            //hm.put(ch,hm.getOrDefault(ch,0)+1);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }
        for(Character key : hm.keySet()){
            if(hm.get(key)>1){
                System.out.println(key+" "+hm.get(key));
            }
        }
    }
    public static void main(String[] args) {
        String str = "pwwkew";
        //printDups(str);
        lengthOfLongestSubstring(str);
    }
    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0 ; i<s.length() ; i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                ans = Math.max(ans,i-left+1);
            }else{
                System.out.println(set);
                System.out.println(left+" "+i);
                while(s.charAt(left)!=s.charAt(i)){
                    set.remove(s.charAt(left));
                    left++;
                }
                System.out.println(set);
                System.out.println(left+" "+i);
                set.remove(s.charAt(left));
                left++;
                System.out.println(set);
                set.add(s.charAt(i));
                System.out.println();
            }
        }
        return ans;
    }
}

