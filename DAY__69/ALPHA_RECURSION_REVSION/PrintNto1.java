package DataStructuresAlgorithm.DAY__69.ALPHA_RECURSION_REVSION;

public class PrintNto1 {
    public static void main(String[] args) {
        print(10);
    }
    public static void print(int n){
        if(n==0){
            return ;
        }
        System.out.print(n + " ");
        print(n-1);
    }
}
