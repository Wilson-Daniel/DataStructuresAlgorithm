package DataStructuresAlgorithm.DYNAMIC_PROGRAMMING;

public class DP_01_KNAPSACK {
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        int n = val.length;
        int[][] dp = new int[n+1][W+1];
        for(int i=0 ; i<dp.length ; i++){
            for(int j=0 ; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(knapSack(val,wt,W,val.length,dp));
    }
    public static int knapSack(int[] val,int[] wt,int W,int n,int[][] dp){
        if(W==0 || n==0){
            return 0;
        }
        if(dp[n][W]!=-1){
            return dp[W][n];
        }
        if(wt[n-1]<= W){ //valid
            //include
            int ans1 = val[n-1]+ knapSack(val,wt,W-wt[n-1],n-1,dp);
            //exclude
            int ans2 = knapSack(val,wt,W,n-1,dp);
            dp[n][W] =  Math.max(ans1,ans2);
            return dp[n][W];
        }else{  //not valid
            dp[n][W] = knapSack(val,wt,W,n-1,dp);
            return dp[n][W];
        }
    }

}
