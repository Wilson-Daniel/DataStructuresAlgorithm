package DataStructuresAlgorithm.DAY__69.ALPHA_RECURSION_REVSION;

public class FactorialOfN {
    public static void main(String[] args) {
        System.out.println(facto(5));
    }
    public static int facto(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = facto(n-1);
        int fn = n*fnm1;
        return fn;
    }
}
