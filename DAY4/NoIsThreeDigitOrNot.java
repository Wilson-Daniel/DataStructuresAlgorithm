package DataStructuresAlgorithm.DAY4;

import java.util.Scanner;

public class NoIsThreeDigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No.: ");
        int n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
