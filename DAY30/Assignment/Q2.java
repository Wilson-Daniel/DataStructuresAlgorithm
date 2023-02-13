package DataStructuresAlgorithm.DAY30.Assignment;

import java.util.ArrayList;

public class Q2 {
    /*
    Given a string s, return the string which contains all characters of s in lexicographical
    order.
    InputA - coding
    OutputA - cdgVno
     */
    public static String lexico(String s){
        String ans = "";
        int an = 0;
        int n = s.length();
        Character[] str = new Character[n];
        for(int i=0 ; i<n ; i++){
            str[i] = s.charAt(i);
        }
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(str[i].compareTo(str[j]) > 0){
                    an++;
                    char temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for(int i=0 ; i<n ; i++){
            ans+=str[i];
        }
        System.out.println(an);
        return ans;
    }

    public static void main(String[] args) {
        String s = "abchava";
        System.out.println(lexico(s));
    }
}
