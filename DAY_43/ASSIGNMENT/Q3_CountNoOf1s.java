package DataStructuresAlgorithm.DAY_43.ASSIGNMENT;

public class Q3_CountNoOf1s {
    public static void main(String[] args) {
        int n = 1;
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
}
