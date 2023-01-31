package DataStructuresAlgorithm.DAY22;

public class RECURSION_REVISE_fabonacci_series {

    public static int fab(int n){
        if(n==0 || n==1){
            return n;
        }
        int prev = fab(n-1);
        int prev2 = fab(n-2);
        int ans = prev+prev2;
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(fab(6));
    }
}
