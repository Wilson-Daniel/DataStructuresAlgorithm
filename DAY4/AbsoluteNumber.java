package DataStructuresAlgorithm.DAY4;

import java.util.Scanner;

public class AbsoluteNumber {
    public static void main(String[] args) {
        //absolute bo. is |-1| = 1 , |3| = 3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println(n*=-1);
        }else{
            System.out.println(n);
        }
    }
}
