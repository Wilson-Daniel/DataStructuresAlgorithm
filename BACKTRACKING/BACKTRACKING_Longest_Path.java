package DataStructuresAlgorithm.BACKTRACKING;

public class BACKTRACKING_Longest_Path {
    public static void main(String[] args) {
        int mat[][] = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };

        // find longest path with source (0, 0) and
        // destination (1, 7)

        System.out.println(findLongestPath1(mat, 0, 0, 2,3,mat.length,mat[0].length,0,-1));


    }
    public static int findLongestPath1(int[][] mat,int row,int col,int drow,int dcol,int n,int m,int sum,int max){

        if(row==drow && col==dcol){
            if(sum>max){
                max = sum;
            }
            return max;
        }
        if(mat[row][col]==0 || mat[drow][dcol]==0){
            return max;
        }
        mat[row][col] = 0;
        if(row!=n-1 && mat[row+1][col]>0) {
            max = findLongestPath(mat, row + 1, col, drow, dcol, n,m,sum + 1, max);
        }
        if(col!=m-1 && mat[row][col+1] >0) {
            max = findLongestPath(mat, row, col + 1, drow, dcol, n,m,sum + 1, max);
        }
        if(row!=0 && mat[row-1][col]>0) {
            max = findLongestPath(mat, row - 1, col, drow, dcol, n,m,sum + 1, max);
        }
        if(col !=0 && mat[row][col-1]>0) {
            max = findLongestPath(mat, row, col - 1, drow, dcol,n,m, sum + 1, max);
        }
        mat[row][col] = 1;
        return max;
    }
    public static int findLongestPath(int[][] mat, int i,
                                      int j, int di, int dj,
                                      int n, int m, int cur,
                                      int ans)
    {
        // If we reach the destination
        if (i == di && j == dj) {
            // If current path steps are more than previous
            // path steps
            if (cur > ans)
                ans = cur;
            return ans;
        }

        //if the source or destination is a hurdle itself
        if(mat[i][j]==0 || mat[di][dj]==0) return ans;

        // Mark as visited
        mat[i][j] = 0;

        // Checking if we can reach the destination going
        // right
        if (j != m - 1 && mat[i][j + 1] > 0)
            ans = findLongestPath(mat, i, j + 1, di, dj, n,
                    m, cur + 1, ans);

        // Checking if we can reach the destination going
        // down
        if (i != n - 1 && mat[i + 1][j] > 0)
            ans = findLongestPath(mat, i + 1, j, di, dj, n, m, cur + 1, ans);

        // Checking if we can reach the destination going
        // left
        if (j != 0 && mat[i][j - 1] > 0)
            ans = findLongestPath(mat, i, j - 1, di, dj, n,
                    m, cur + 1, ans);

        // Checking if we can reach the destination going up
        if (i != 0 && mat[i - 1][j] > 0)
            ans = findLongestPath(mat, i - 1, j, di, dj, n,
                    m, cur + 1, ans);

        // Marking visited to backtrack
        mat[i][j] = 1;

        // Returning the answer we got so far
        return ans;
    }
}
