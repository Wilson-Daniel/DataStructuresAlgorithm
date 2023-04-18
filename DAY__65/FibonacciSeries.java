package DataStructuresAlgorithm.DAY__65;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1 = fibo(n-1);
        int fnm2 = fibo(n-2);
        int fn = fnm1+fnm2;
        return fn;
    }
}
