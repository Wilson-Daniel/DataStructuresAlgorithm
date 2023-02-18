package DataStructuresAlgorithm.DAY32;

public class ReverseStringQuestionGFG {
    public static String reverseWords(String S)
    {
        // code here
        String[] arr = S.split("\\.");
        String str = "";
        for(int i= arr.length-1; i>=0; i--){
            str+= (arr[i] +".");
        }
        return str.substring(0,str.length()-1);
    }

    public static void main(String[] args) {
        String a = "pqr.mno";
        String ans =reverseWords(a);
        System.out.println(ans);
    }
}
