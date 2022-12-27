package DataStructuresAlgorithm.DAY3;

public class CheckForPalindromeNumber {
    public static void main(String[] args) {
        int n=121;
        int temp = n;
        int sum = 0;
        while(temp>0){
            int lastdigit = temp%10;
            System.out.println(lastdigit);
            sum=sum*10;
            sum+=lastdigit;
            System.out.println(sum);
            temp/=10;
            System.out.println(temp);
        }
        if(sum == n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
