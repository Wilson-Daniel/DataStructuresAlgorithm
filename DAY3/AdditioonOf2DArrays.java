package DataStructuresAlgorithm.DAY3;

public class AdditioonOf2DArrays {
    public static void main(String[] args) {
        int n=3;
        int[][] a = {{1,1,1},{1,1,1},{1,1,1}};
        int[][] b = {{1,1,1},{1,1,1},{1,1,1}};
        int[][] c = new int[n][n];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                c[i][j]+=a[i][j]*b[i][j];
            }
        }
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(c[i][j]);
            }
            System.out.println();
        }

    }
}
