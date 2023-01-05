package DataStructuresAlgorithm.DAY12;

public class TIMECOMPLEXITY {
    public static void main(String[] args) {
        System.out.println(naturalSum(4556));

    }
    public static int naturalSum(int n){
        int ans  = n*(n+1)/2;   //////////////////////OPTIMISED
        return ans;
    }
}
