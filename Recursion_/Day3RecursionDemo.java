package Recursion;

public class Day3RecursionDemo {
    public static void main(String[] args) {
        //hello(6);
        //System.out.println("Sum "+sumOfNnaturalNo(3));
        System.out.println("power "+power(4,3));
    }
    public static void hello(int n){
        if(n==0){
            return;
        }
        System.out.println("Hello");
        hello(n-1);
    }
    public static int sumOfNnaturalNo(int n){
        int sum=n;
        if(n==1){
            System.out.println("aa");
            return sum;
        }
        return sum+sumOfNnaturalNo(n-1);
    }

    public static int power(int a,int b){
        int sum = a;
        if(b==0){
            return 1;
        }
        return sum*power(a,b-1);
    }
}
