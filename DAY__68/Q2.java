package DataStructuresAlgorithm.DAY__68;

public class Q2 {
    public static void main(String[] args) {
        String[] digit = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int n =  998;
        digitTOletter(n,"",digit);
    }
    public static void digitTOletter(int n,String ans,String[] digits){
        if(n==0){
            return;
        }
        int digit = n%10;
        digitTOletter(n/10,ans,digits);

        System.out.print(digits[digit]+" ");


    }
}
