package DataStructuresAlgorithm.RECURSION;

public class RECURSION_Sum_Natural_Num {
    public static void main(String[] args) {
        System.out.println(sum(2));
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
