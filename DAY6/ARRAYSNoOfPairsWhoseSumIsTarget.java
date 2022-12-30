package DataStructuresAlgorithm.DAY6;


public class ARRAYSNoOfPairsWhoseSumIsTarget {

    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};
        System.out.println(returnPair(arr,7));
    }

    public static int returnPair(int[] arr,int t) {
        int ans = 0;
        for(int i=0 ; i< arr.length ; i++){
            for(int j=i ; j<arr.length ; j++){
                if(arr[i]+arr[j]==t){
                    ans++;
                }
            }
        }
        return ans;
    }
}
