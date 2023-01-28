package DataStructuresAlgorithm.DAY20;

public class RECURSION_STRING_Palindrome {
    public static void main(String[] args) {
        String s = "abbas";
//        if(s.equals(palindrome(s,0,5))){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }
        System.out.println(palindrome(s,0,s.length()));
//        int l=0,r=4;
////        System.out.println(s.substring(l+1,r-1));
//        String c = "abcde";
//        System.out.println(reverseStr(c));
    }
    public static boolean palindrome(String s,int l,int r){
        if(l<=r){
            return true;
        }
        return (s.charAt(l) == s.charAt(r)) && palindrome(s,l+1,r-1);
    }
    public static String reverseStr(String s){
        if(s.length()==0){
            return "";
        }
        String smallAns = reverseStr(s.substring(1));
        return smallAns+s.charAt(0);
    }
}
