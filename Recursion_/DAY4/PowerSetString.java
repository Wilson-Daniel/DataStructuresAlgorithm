package Recursion.DAY4;

public class PowerSetString {
    public static void main(String[] args){
        powerSet("abc",0,"");
    }
    public static void powerSet(String S, int i, String cur){
        if(i == S.length()){
            System.out.println(cur);
            return;
        }
        powerSet(S,i+1,cur+S.charAt(i));
        powerSet(S,i+1,cur);

    }
}
