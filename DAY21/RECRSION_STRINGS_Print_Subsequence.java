package DataStructuresAlgorithm.DAY21;

public class RECRSION_STRINGS_Print_Subsequence {

    public static void getSQQ(String s,String subans){
        if(s.length() == 0){
            System.out.println(subans);
            return;
        }
        char curr = s.charAt(0);

        String subString = s.substring(1);
        getSQQ(subString,subans+curr);
        getSQQ(subString,subans);
    }

    public static void main(String[] args) {
        getSQQ("abc","");
    }

}
