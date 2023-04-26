package DataStructuresAlgorithm.DAY__69.ALPHA_RECURSION_REVSION;

public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(tile(3));
    }
    public static int tile(int n){
        if(n==0 || n==1){
            return 1;
        }
        //choices
        //vertical
        int fnm1 = tile(n-1);
        //horizontal
        int fnm2 = tile(n-2);
        int fn = fnm1+fnm2;
        return fn;
    }

}
