package DataStructuresAlgorithm.DAY20.ASSIGNMENT;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(numberOfPaths(2,3));
    }
    public static int numberOfPaths(int m, int n) {
        if(m==1 && n==1){
            return 1;
        }
        if(m<0 || n<0){
            return 0;
        }
        return numberOfPaths(m-1,n) + numberOfPaths(m,n-1);
    }
}
