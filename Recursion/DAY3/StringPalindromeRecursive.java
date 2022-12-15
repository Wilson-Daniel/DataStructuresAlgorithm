package DataStructuresAlgorithm.Recursion.DAY3;

public class StringPalindromeRecursive {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aabdmmddcsbaa",0,5));
    }
    public static int isPalindrome(String S,int l,int r) {
        // code here

        if(l>=r){
            return 1;
        }
        if(S.charAt(l) != S.charAt(r)){
            return 0;
        }

        return isPalindrome(S,l+1,r-1);
    }
}
