package DataStructuresAlgorithm.DAY15;

public class RECURSION_Sum_ofNum {
    public static void main(String[] args) {
        System.out.println(sum(513));
        System.out.println(countDigits(523));
    }

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int ans = sum(n/10);
        int temp = ans + n%10;
        return temp;
    }
    //Given an integer, count no. of digits
    public static int countDigits(int n){
        if(n>=0 && n<=9){
            return 1;
        }
        return countDigits(n/10)+1;
    }
}
