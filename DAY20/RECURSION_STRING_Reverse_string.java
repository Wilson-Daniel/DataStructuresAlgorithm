package DataStructuresAlgorithm.DAY20;

public class RECURSION_STRING_Reverse_string {
    //Reverse a given string
    public static void main(String[] args) {
        String s = "sbbdh";
        System.out.println(reverseStr(s));
    }
    public static String reverseStr(String s){
        if(s.length()==0){
            return "";
        }
        String smallAns = reverseStr(s.substring(1));

        return smallAns+s.charAt(0);
    }
}
