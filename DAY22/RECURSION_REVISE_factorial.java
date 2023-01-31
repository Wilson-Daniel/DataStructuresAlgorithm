package DataStructuresAlgorithm.DAY22;

public class RECURSION_REVISE_factorial {
    /*
    To find a factorial using recursion
     */
    public static int fact(int n){
        if(n==1){
            return n; // base case
        }
        int smallProb = fact(n-1);//smallProblem
        return n*smallProb;//self-work
    }

    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}
