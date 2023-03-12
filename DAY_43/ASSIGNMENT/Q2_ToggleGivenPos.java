package DataStructuresAlgorithm.DAY_43.ASSIGNMENT;

import java.util.Scanner;

public class Q2_ToggleGivenPos {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Position");
        int pos = 3;
        int n = 5;
        int bitMask = 1<<pos;

        if((bitMask & n)!=1){
            System.out.println("Digit Is 0");
            int notBitMask = ~(bitMask);
            int finalNum = notBitMask & n;
            System.out.println(finalNum);
        }else{
            System.out.println("Digit Is 1");
            int finalNumber = bitMask | n;
            System.out.println(finalNumber);
        }
    }
}
