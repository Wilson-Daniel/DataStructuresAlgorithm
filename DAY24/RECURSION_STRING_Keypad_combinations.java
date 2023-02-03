package DataStructuresAlgorithm.DAY24;

import java.util.ArrayList;

public class RECURSION_STRING_Keypad_combinations {
    public static void main(String[] args) {
//        String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//        combinations("253",kp,"");
        int[] a = {2,3};
        ArrayList<String> ans = new ArrayList<>();
        ans.add("s");

        System.out.println(possibleWords(a,2));
    }
    public static void combinations(String dig,String[] kp , String currAns){
        if(dig.length() == 0){
            System.out.print(currAns+" ");
            return;
        }
        char ch = dig.charAt(0);
        int currChar = ch - '0';
        String currentChoise = kp[currChar];
        for(int i=0 ; i<currentChoise.length() ; i++){
            combinations(dig.substring(1),kp,currAns+currentChoise.charAt(i));
        }
    }

    static ArrayList<String> possibleWords(int a[], int N)
    {
        // your code here
        String dig = "";
        String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(int i=0 ; i<a.length ; i++){
            dig+=String.valueOf(a[i]);
        }
        System.out.println(dig);
        ArrayList<String> ans = new ArrayList<>();
        combinations1(dig,kp,"",ans);
        return ans;
    }

    public static void combinations1(String dig,String[] kp , String currAns , ArrayList<String> ans){
        if(dig.length() == 0){
            ans.add(currAns);
            return;
        }
        char ch = dig.charAt(0);
        int currChar = ch - '0';
        String currentChoise = kp[currChar];
        for(int i=0 ; i<currentChoise.length() ; i++){
            combinations1(dig.substring(1),kp,currAns+currentChoise.charAt(i),ans);
        }
    }
//    static ArrayList <String> possibleCom(int a[],String[] k,int idx,int N,String currAns){
//        ArrayList<String> ans = new ArrayList();
//        if(idx == a.length-1){
//            ans.add(currAns);
//            return ans;
//        }
//        int currChar = a[idx];
//        String currCharVal = k[currChar];
//        for(int i=0 ; i<currCharVal.length();i++){
//            ans.add(currAns+currCharVal.charAt(i));
//            possibleCom(a,k,idx+1,N,currAns+currCharVal.charAt(i));
//        }
//        return ans;
//    }
}

