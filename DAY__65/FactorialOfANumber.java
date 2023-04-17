package DataStructuresAlgorithm.DAY__65;

public class FactorialOfANumber {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        int factnm1 = fact(n-1);
        int fact = n*factnm1;
        return fact;
    }
}
