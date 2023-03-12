package DataStructuresAlgorithm.DAY_43;


public class BIT_MASKING_ClearABit {
    public static void main(String[] args) {
        int n =5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);
        int newNum = notBitMask & n; //0100 -> 1011 & 0101 -> 0001 which is (1)base10
        System.out.println(newNum);
    }


}
