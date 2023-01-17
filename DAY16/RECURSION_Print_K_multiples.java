package DataStructuresAlgorithm.DAY16;

public class RECURSION_Print_K_multiples {
    public static void main(String[] args) {
        printK(12,5);
    }
    public static void printK(int n, int k){
        if(k==0){
            return;
        }
        printK(n,k-1);
        System.out.print(n*k+" ");

    }
}
