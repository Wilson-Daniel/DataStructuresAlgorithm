package DataStructuresAlgorithm.DAY9;

public class TWO_D_ARRSYS_Return_N_rows_Pascal_Triangle {
    public static void main(String[] args) {
        int[][] ans = pascalTriancle(5);
        printArrays(ans,5,5);
    }
    public static int[][] pascalTriancle(int n){
        int[][] ans = new int[n][];
        for(int i=0; i<=n-1 ; i++){
            ans[i] = new int[i+1];
            for(int j=0 ; j<=i ; j++){
                if(j==0 || j==i){
                    ans[i][j] = 1;
                }else{
                    ans[i][j] = ans[i-1][j]+ans[i-1][j-1];
                }
            }
        }
        return ans;
    }
    public static void printArrays(int[][] arr,int r1,int c1){
        for(int i=0 ; i<r1 ; i++){
            for (int j=0 ; j<i ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
