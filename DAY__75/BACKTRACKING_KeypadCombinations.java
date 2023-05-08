package DataStructuresAlgorithm.DAY__75;

import java.util.ArrayList;

public class BACKTRACKING_KeypadCombinations {
    public static void main(String[] args) {
        letterCombinations("234");
    }
    final static char[][] L = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},
            {'j','k','l'},{'m','n','o'},{'p','q','r','s'},
            {'t','u','v'},{'w','x','y','z'}};
    public static void letterCombinations(String D) {
        int len = D.length();
        ArrayList<String> ans = new ArrayList<>();
        if (len == 0) {
            System.out.println("");
            return;
        }
        bfs(ans,0, len, new StringBuilder(), D);
        System.out.println(ans);
    }
    public static void bfs(ArrayList<String> ans, int pos, int len, StringBuilder sb, String D) {
        if (pos == len){
            ans.add(sb.toString());
            //System.out.println(sb.toString());
        }
        else {
            char[] letters = L[Character.getNumericValue(D.charAt(pos))];
            for (int i = 0; i < letters.length; i++)
                bfs(ans,pos+1, len, new StringBuilder(sb).append(letters[i]), D);
        }
    }


}
