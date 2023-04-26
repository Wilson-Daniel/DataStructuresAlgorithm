package DataStructuresAlgorithm.DAY__69.ALPHA_RECURSION_REVSION;

public class RemoveDuplicasyFromString {
    public static void main(String[] args) {
        String str = "apnacollege";
        boolean[] map = new boolean[26];
        StringBuilder ans = new StringBuilder("");
        remove(str,map,0,ans);
        System.out.println(ans);
    }
    public static void remove(String str,boolean[] map,int idx,StringBuilder ans){
        if(idx == str.length()){
            return ;
        }
        char ch = str.charAt(idx);
        if(map[ch-'a'] == true){
            remove(str,map,idx+1,ans);
        }else{
            map[ch-'a'] = true;
            remove(str,map,idx+1,ans.append(ch));
        }


    }

}
