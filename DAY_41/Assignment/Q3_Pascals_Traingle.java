package DataStructuresAlgorithm.DAY_41.Assignment;

public class Q3_Pascals_Traingle {
    public static void main(String[] args) {

    }
    public static void pascalsTriangle(int n){
        int sum=1;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n-i ; j++){
                System.out.print("  ");
            }
            int[][] arr = new int[i][];
            for(int j=1 ; j<=i ; j++){
                if(j==1 || j==i){
                    sum=1;
                    //arr[];
                }else{
                    //sum=(i-1)
                }
            }
        }
    }
}
