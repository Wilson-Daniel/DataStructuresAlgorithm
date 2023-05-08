package DataStructuresAlgorithm.DAY__76;

import java.util.ArrayList;
import java.util.List;

public class FIndPermutations {

    public static void permu(String S,List<String> ans, String subAns,int idx){
        if(S.length() == 0){
            ans.add(subAns);
            return;
        }
        for(int i=0 ; i<S.length() ; i++){
            char ch = S.charAt(i);
            String newString = S.substring(0,i)+S.substring(i+1);
            permu(newString,ans,subAns+ch,idx+1);
        }

    }

    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        String subAns ="";
        String S = "abc";
        permu(S,ans,subAns,0);
        System.out.println(ans);
    }

}
