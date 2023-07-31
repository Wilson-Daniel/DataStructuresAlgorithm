package DataStructuresAlgorithm.RECURSION;

public class RECURSION_Removing_Duplicates {
    public static void main(String[] args) {
        boolean[] arr = new boolean[27];
        StringBuilder ans = new StringBuilder("");
        remove("abcdeedca",ans,arr,0);

    }
    public static void remove(String str,StringBuilder ans,boolean[] arr,int idx){
        if(idx==str.length()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(idx);
        if(arr[ch-'a']){
            remove(str,ans,arr,idx+1);
        }else{
            arr[ch-'a']=true;
            remove(str,ans.append(ch),arr,idx+1);
        }
    }
}
