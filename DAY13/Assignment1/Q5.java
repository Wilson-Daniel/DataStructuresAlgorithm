package DataStructuresAlgorithm.DAY13.Assignment1;

public class Q5 {
    //Q5 - Write a Java program to swap two numbers with the help of a third variable.
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
}
