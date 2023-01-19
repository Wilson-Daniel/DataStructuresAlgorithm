package DataStructuresAlgorithm.DAY17;

public class RECURSION_Assignment {
//    Given a number n. Print if it is an armstrong number or not.
//    An armstrong number is a number if the sum of every digit in that number raised to the power
//    of total digits in that number is equal to the number.
    //Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number.
    public static void main(String[] args) {
        //System.out.println(armstrong(153));
        int n =134;
        int digits = callDigits(n);
        if(armstrong(n,digits) == n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        //System.out.println(armstrong(n,digits));
    }
    public static int armstrong(int n,int digits){
        if(n==0){
            return 0;
        }
        int powercal = calcPower(n%10,digits); //Calculating Power for last digit taken out SELFWORK
        //System.out.println(powercal);

        int calsubproblem = armstrong(n/10,digits); //Calling to calculate SUBPROBLEM
        //System.out.println(calsubproblem);

        return powercal+calsubproblem;
    }
    public static int callDigits(int n){
        if(n==0){
            return 0;
        }
        return callDigits(n/10)+1;
    }
    public static int calcPower(int n,int power) {
        if(power==0) {
            return 1;
        }
        return n * calcPower(n,power-1);
    }
}
