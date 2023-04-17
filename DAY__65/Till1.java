package DataStructuresAlgorithm.DAY__65;

public class Till1 {
    //f(n) = n + f(n-1)
    public static void main(String[] args) {
        int n = 10;
        printRec(n);
    }
    public static void printRec(int n){
        if(n==1){  //base case
            System.out.println(n);
            return;
        }
        System.out.println(n);  //self work
        printRec(n-1);  //recursive call
    }
}
