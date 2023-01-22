package DataStructuresAlgorithm.DAY20;

public class RECURSION_STRING_Palindrome {
    public static void main(String[] args) {
        String s = "a";
        if(s.equals(palindrome(s))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static String palindrome(String s){
        return reverseStr(s);
    }
    public static String reverseStr(String s){
        if(s.length()==0){
            return "";
        }
        String smallAns = reverseStr(s.substring(1));
        return smallAns+s.charAt(0);
    }
}
