package DataStructuresAlgorithm.DAY13;

public class RECURSION_Sum_Of_N_NatNum {
    public static void main(String[] args) {
        //printIncreasing(5);
        printDecreasing(5);

    }
    public static void printIncreasing(int n){ // 1,2,3.....n-1,n
        if(n==1){
            System.out.println(n);
            return;
        }

        printIncreasing(n-1); //1,2,3.....n-1
        System.out.println(n);   //n
    }
    ///print from n to 1 using recursion
    public static void printDecreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
}
