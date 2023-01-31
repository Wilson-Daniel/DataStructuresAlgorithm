package DataStructuresAlgorithm.DAY21;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RECURSION_STRINGS_Subsets_String {

    public static ArrayList<String> getSQQ(String s){


        ArrayList<String> ans = new ArrayList<>();
        if(s.length() == 0){
            ans.add("");
            return ans;
        }
        char curr = s.charAt(0);
        ArrayList<String> smallans = getSQQ(s.substring(1));
        // smallans = ["bc" , "b" , "c" , " "]
        for(String ss : smallans){
            ans.add(ss); // ans = {""bc" , "b" , "c" , " "}
            ans.add(curr+ss); // ans  = {"bc" , "abc" , "b" , 'ab' , "c" , "ac" , " " , "a"}
        }
        return ans;

    }

    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> ans = getSQQ(s);
        System.out.println(ans);
    }
}
