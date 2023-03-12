package DataStructuresAlgorithm.DAY_43;

import java.util.Scanner;

public class BIT_MASKING_UpdateABit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;

        if(input == 0){
            int notBitMAsk = ~(bitMask);
            int newNum = notBitMAsk & n;
            System.out.println(newNum);
        }else{
            int newNum1 = bitMask | n;
            System.out.println(newNum1);
        }
    }
}
