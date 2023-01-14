package DataStructuresAlgorithm.DAY14;

public class RECURSION_Fact_ofa_number {
    public static void main(String[] args) {
        //System.out.println(fact(4));
        System.out.println(fabo(6));
    }

    public static int fact(int n){
        if(n ==0 ){
            return 1;
        }
        int smallAns = fact(n-1);
        int ans = n*smallAns;
        return ans;
    }
    public static int fabo(int n){
        //base case
        if(n==0 || n==1){
            return n;
        }
        int prev = fabo(n-1);
        int prevv = fabo(n-2);
        int ans = prev + prevv;
        return ans;

    }
}
