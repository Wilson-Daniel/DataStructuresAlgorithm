package DataStructuresAlgorithm.DAY30;

public class RecursionPracticeFibonacci {
    public static int fibo(int n){
        if(n == 0 || n==1){
            System.out.print(n+" ");
            return n;
        }
        //int subans = fibo(n-1)+fibo(n-2);
        int pre = fibo(n-1);
        int pre2 = fibo(n-2);
        int ans = pre+pre2;
        System.out.print(ans+" ");
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
}
