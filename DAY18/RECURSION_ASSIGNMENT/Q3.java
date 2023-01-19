package DataStructuresAlgorithm.DAY18.RECURSION_ASSIGNMENT;

public class Q3 {
//    Q4 - Given a decimal number as input, we need to write a program to convert the given
//    decimal number into its equivalent binary number.
    public static void main(String[] args) {
        calculateBinary(10);
    }
    public static void calculateBinary(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n%2);
        calculateBinary(n/2);

    }


}
