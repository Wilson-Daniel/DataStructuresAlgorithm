package DataStructuresAlgorithm.DAY6;

public class ARRAYSNoOfTripletsWhoseSumIsTarget {
    public static int triplet(int[] arr, int t){
        int ans =0;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ;  j<arr.length ; j++){
                for(int k=j+1 ; k<arr.length ; k++){
                    if(arr[i]+arr[j]+arr[k]==t){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,6,3,5};
        System.out.println(triplet(arr,12));
    }
}
