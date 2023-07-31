package DataStructuresAlgorithm.RECURSION;

public class RECURSION_Print_Numbers {
    public static void main(String[] args) {
        pri(5);
    }
    public static void pri(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        pri(n-1);
        System.out.print(n+" ");
    }
}
