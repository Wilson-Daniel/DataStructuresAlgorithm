package DataStructuresAlgorithm.BACKTRACKING;

public class BACKTRACKING_GRID_WAYS {
    public static void main(String[] args) {
        String s = "errr";
        System.out.println(s.indexOf('r',s.length()-1));
        System.out.println(gridWays(0,0,3,3));
        System.out.println(gridWaysOptmized(3,3));
    }
    public static int gridWays(int i,int j,int n,int m){
        if(i==n-1 && j==n-1){
            return 1;
        }else if(i==n || j==m){
            return 0;
        }
        int w1 = gridWays(i+1,j,n,m);
        int w2 = gridWays(i,j+1,n,m);
        return w1+w2;
    }
    public static int gridWaysOptmized(int n,int m){
        int ans = fact(n-1)+fact(m-1);
        int ans2 = fact((n-1)+(m-1));
        return ans2/ans;
    }
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
