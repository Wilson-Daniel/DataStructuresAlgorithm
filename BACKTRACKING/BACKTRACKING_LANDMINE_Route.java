package DataStructuresAlgorithm.BACKTRACKING;

public class BACKTRACKING_LANDMINE_Route {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
                { 1, 0, 1, 1, 1, 1, 1, 1, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 0, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 } };
        int col = 10;
        int row = 12;
        int ans = 0;
        for(int i=0 ; i<row; i++){
            if(isSafe(mat,i,0,row,col)){
                int len = solve(mat,new boolean[row][col],i,0,row,col,ans);
                minAns = Math.min(minAns,len);
            }
        }
        System.out.println(minAns);

    }
    public static int minAns = 0;
    public static boolean isSafe(int grid[][],int i,int j,int row,int col){
        if(grid[i][j]==0){
            return false;
        }
        if(i+1<row){
            if(grid[i+1][j]==0){
                return false;
            }
        }
        if(j+1<col){
            if(grid[i][j+1]==0 ){
                return false;
            }
        }
        if(i-1>=0){
            if(grid[i-1][j]==0 ){
                return false;
            }
        }
        if(j-1>=0){
            if(grid[i][j-1]==0 ){
                return false;
            }
        }
        return true;
    }
    public static int solve(int[][] grid,boolean[][] vis,int i,int j,int row,int col,int ans){
        if(i>=row || i<0 || j==col || j<0 || vis[i][j]){
            return Integer.MAX_VALUE;
        }
        if(j==col-1){
            return ans;
        }
        vis[i][j]=true;
        int l1 = solve(grid,vis,i+1,j,row,col,ans+1);
        int l2 = solve(grid,vis,i-1,j,row,col,ans+1);
        int l3 = solve(grid,vis,i,j+1,row,col,ans+1);
        int l4 = solve(grid,vis,i,j-1,row,col,ans+1);
        vis[i][j] = false;
        return l1+l2+l3+l4;
    }
}
