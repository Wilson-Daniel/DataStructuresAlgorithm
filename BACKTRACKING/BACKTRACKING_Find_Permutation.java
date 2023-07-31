package DataStructuresAlgorithm.BACKTRACKING;

public class BACKTRACKING_Find_Permutation {
    public static void main(String[] args) {
        findPer("abc","");
    }
    public static void findPer(String str,String ans){
        if(str.length()== 0){
            System.out.println(ans);
            return;
        }

        for(int i=0 ; i<str.length() ; i++){
            String newStr = str.substring(0,i)+str.substring(i+1);
            findPer(newStr,ans+str.charAt(i));
        }
    }
}
