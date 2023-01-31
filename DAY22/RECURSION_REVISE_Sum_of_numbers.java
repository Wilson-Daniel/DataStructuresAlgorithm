package DataStructuresAlgorithm.DAY22;

public class RECURSION_REVISE_Sum_of_numbers {
    /*
    Find sum of all digits of n numbers
     */
    public static int sum(int n){

        if(n>=0 && n<=9){
            return n;
        }
        int ans =  sum(n/10);// recursive work
        return ans+n%10; // self work
    }

    public static void main(String[] args) {
        System.out.println(sum(512));
    }
}
