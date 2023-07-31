package DataStructuresAlgorithm.RECURSION;

public class RECURSION_Tiling_Problem {
    public static void main(String[] args) {
        System.out.println(countWays(4,2));
        System.out.println(tiling(4));
    }
    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int f1 = tiling(n-1);
        //horizontal choics
        int f2 = tiling(n-2);
        return f1+f2;
    }
    public static int countWays(int n, int m)
    {
        // Code here
        if(n==0 || n==1 || m==0 || m==1){
            return 1;
        }

        //vertical
        int fn1 = countWays(n-1,m);
        //vertical
        if(m>n){
            return fn1;
        }
        int fn2 = countWays(n-m,m);
        return fn1+fn2;
    }
}
