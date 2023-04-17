package DataStructuresAlgorithm.DAY__65;

public class Print1ToN {
    //print form 1 to N
    // N = 5
    // f(n) = f(n-1) + n
    //1 2 3 4 5
    public static void main(String[] args) {
        printN(5);
    }
    public static void printN(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printN(n-1);
        System.out.println(n);
    }
}
