package DataStructuresAlgorithm.DAY__61;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNon_Rep {
    public static void main(String[] args) {
        Queue<Character> q1 = new LinkedList<>();
        String str = "aabccxb";
        int n = str.length();
        int i=1;
        char nonRep = str.charAt(0);
        while(i<n){

            q1.add(str.charAt(i));

        }
    }
}
