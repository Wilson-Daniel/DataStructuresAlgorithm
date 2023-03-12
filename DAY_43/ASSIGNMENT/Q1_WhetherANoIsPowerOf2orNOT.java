package DataStructuresAlgorithm.DAY_43.ASSIGNMENT;

public class Q1_WhetherANoIsPowerOf2orNOT {
    /*
        Calculate Whether a number is power of 2 or Not
     */
    public static void main(String[] args) {
        int power = 3;
        int num = power(2,power);
        //System.out.println(num);
        int bitMask = 1<<power;
        //System.out.println(bitMask & num);
        if((bitMask & num)==0){
            System.out.println("No not power of 2");
        }else{
            System.out.println("Yes power of 2");
        }
    }
    public static int power(int n,int a){
        if(a==1){
            return n;
        }
        return n*power(n,a-1);
    }
}
