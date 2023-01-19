package DataStructuresAlgorithm.DAY18.RECURSION_ASSIGNMENT;

public class Q2 {
    //- Given two number x and y find product using recursion.
    public static void main(String[] args) {
        System.out.println(calcPower(3,3));
    }
    public static int calcPower(int n,int power) {
        if(power==0) {
            return 1; // BaseCase
        }
        return n * calcPower(n,power-1);//SelfWork * Subproblem
    }
}
