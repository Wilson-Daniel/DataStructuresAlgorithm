package DataStructuresAlgorithm.RECURSION;

public class RECURSION_Power {
    public static void main(String[] args) {
        System.out.println(power(3,3));
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
}
