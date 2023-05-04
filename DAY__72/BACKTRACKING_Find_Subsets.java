package DataStructuresAlgorithm.DAY__72;

public class BACKTRACKING_Find_Subsets {
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str,"",0);
    }
    public static void findSubsets(String str,String ans, int idx){
        //bc
        if(idx == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //yes choice
        findSubsets(str,ans+str.charAt(idx),idx+1);
        //no choice
        findSubsets(str,ans,idx+1);
    }
}
