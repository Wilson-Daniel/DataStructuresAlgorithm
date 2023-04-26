package DataStructuresAlgorithm.DAY__69.ALPHA_RECURSION_REVSION;

public class PowerOfXtoN {
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int fnm1 = power(x,n-1);
        int ans = x*fnm1;
        return ans;

    }
}
