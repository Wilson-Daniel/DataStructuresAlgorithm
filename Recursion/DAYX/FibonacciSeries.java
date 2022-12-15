package DataStructuresAlgorithm.Recursion.DAYX;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int call1 = fibo(n-1);
        int call2 = fibo(n-2);
        int sum = call1+call2;
        return sum;
    }
}
