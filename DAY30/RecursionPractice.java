package DataStructuresAlgorithm.DAY30;

public class RecursionPractice {
    public static void main(String[] args) {
        int ans = fact(4);
        System.out.println(ans);
    }
    public static int fact(int n){
        if(n==1){
            return 1;
        }

        int subans = fact(n-1);
        return n*subans;
    }
}
