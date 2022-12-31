package DataStructuresAlgorithm.DAY7;

public class ARRAYSSwap2NoWithout {
    public static void swapWithoutTemp(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a: "+ a +" "+" b: "+ b);;
    }
    public static void main(String[] args){
        swapWithoutTemp(3,4);
    }
}
