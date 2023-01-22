package DataStructuresAlgorithm.DAY20;

public class RECURSION_STRINGS_Remove_all_occurance_of_a {
    //Remove all occurrence of 'a' in a given string s = "scafca" new string -> "scfca"
    public static void main(String[] args) {
        String s = "Manvi Tyagi";
        System.out.println(removeA(s,0));
        System.out.println(removeA2(s));
    }
    public static String removeA(String a,int idx){
        //base case
        if(idx == a.length()){
            return "";
        }
        String ans ="";
        //self work
        if(a.charAt(idx) != 'a'){
            ans+=a.charAt(idx);
        }
        //recursive work
        String smallProb = removeA(a,idx+1);
        return ans+smallProb;
    }
    //Without using extra index
    public static String removeA2(String a){
        if(a.length() == 0){
            return "";
        }
        String ans = "";
        if(a.charAt(0) != 'a'){
            ans+=a.charAt(0);
        }
        String smallAns = removeA2(a.substring(1));
        return ans+smallAns;
    }
}
