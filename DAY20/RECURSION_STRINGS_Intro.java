package DataStructuresAlgorithm.DAY20;

import java.util.Scanner;

public class RECURSION_STRINGS_Intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //College
        //0123456
        System.out.println(s.substring(2,6)); // start,end
        System.out.println(s.substring(1));
    }
}
