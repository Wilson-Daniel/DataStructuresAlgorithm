package DataStructuresAlgorithm.DAY__67;

public class LeetoCode_RemoveDuplicatesAndPrintInCorrectOrder {
    public static void main(String[] args) {

        String s = "aabdg";
        System.out.println(removeDuplicateLetters(s));
    }
    public static String removeDuplicateLetters(String s) {
        int idx = 0;
        int[] map = rempdup(s,idx,new int[26]);
        StringBuilder ans = new StringBuilder("");
        for(int i=0 ; i<map.length ; i++){
            if(map[i]==1){
                char ch = (char)(i +'a');
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static int[] rempdup(String str,int idx,int[] map){
        if(idx==str.length()){
            return map;
        }
        char ch = str.charAt(idx);
        map[ch-'a'] = 1;
        return rempdup(str,idx+1,map);

    }
}
