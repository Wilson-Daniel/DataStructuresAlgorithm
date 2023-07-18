package DataStructuresAlgorithm.STRINGS;

public class STRING_Convert_sentence_into_mobile_numeric {
    public static void main(String[] args) {
        String[] arr = {"2","22","222","3","33","333","4","44","444",
                "5","55","555","6","66","666","7","77","777","7777",
                "8","88","888","9","99","999","9999"};
        String input = "GEEKSFORGEEKS";
        System.out.println(genKeypad(arr,input));
    }
    public static String genKeypad(String[] arr,String S){
        String ans = "";
        for(int i=0  ;i<S.length() ; i++){
            if(S.charAt(i) == ' '){
                ans+="0";
            }else{
                int pos = S.charAt(i)-'A';
                ans+=arr[pos];
            }
        }

        return ans;
    }
}
