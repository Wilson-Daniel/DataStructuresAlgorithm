package DataStructuresAlgorithm.DAY__67;

public class RemoveDuplicatesInAString {
    public static void main(String[] args) {
        boolean[] map = new boolean[26];
        StringBuilder ans = new StringBuilder("");
        System.out.println(dupRem("appnnacollege",0,ans,map));

    }
    public static String dupRem(String str,int idx,StringBuilder ans, boolean[] map){
        //base case
        if(idx==str.length()){
            return "";
        }
        //self-work
        char ch = str.charAt(idx);
        int i = ch-'a';
        if(map[i] == false){
            ans.append(ch);
        }
        map[i] = true;
        //recursive call
        dupRem(str,idx+1,ans,map);
        return ans.toString();
    }


}
