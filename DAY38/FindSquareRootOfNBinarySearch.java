package DataStructuresAlgorithm.DAY38;

public class FindSquareRootOfNBinarySearch {
    public static void main(String[] args) {
        int n=26;

        int ans = rootNo(n);
        System.out.println(ans);

    }
    public static int rootNo(int x){
        int st =0;
        int end = x;
        int ans = -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(mid*mid == x){
                ans = mid;
                return ans;
            }else if(x < mid*mid){
                end = mid-1;
            }else{
                st = mid+1;
                ans = mid;
            }
        }
        return ans;

    }

}
