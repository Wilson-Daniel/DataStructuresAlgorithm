package DataStructuresAlgorithm.DAY18.RECURSION_ASSIGNMENT;

import static java.lang.Integer.valueOf;

public class Q5 {
//    Given the Binary code of a number as a decimal number, we need to convert this into its
//    equivalent Gray Code. In gray code, only one bit is changed in 2 consecutive numbers.
    public static void main(String[] args) {
        grayCode(1001);
    }
    public static void grayCode(int n){
        if(n==1){
            System.out.print("1");
            return;
        }
        int a = n%10;
        n=n/10;
        grayCode(n);
        int b = n%10;
        System.out.print(a^b);

    }
    static String binToGrey(String B) {
        // code here
        int n = B.length()-1;
        String ans = "";
        if(n==1){
            return ans+=n;
        }
        int a = B.charAt(n);
        binToGrey(B.substring(0,n-1));
        int b = B.charAt(n);
        ans+=a^b;
        return ans;
    }
    static String greyToBin(String G) {
        // code here
        int n = Integer.parseInt(G);
        String ans = "";
        if(n==1){
            return ans.concat("1");
        }

        int a = n%10;
        n=n/10;
        grayCode(n);
        int b = n%10;
        return ans.concat(String.valueOf(a^b));
    }
}
