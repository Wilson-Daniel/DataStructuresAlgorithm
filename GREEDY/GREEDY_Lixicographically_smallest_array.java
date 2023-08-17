package DataStructuresAlgorithm.GREEDY;

public class GREEDY_Lixicographically_smallest_array {
    public static void main(String[] args) {
        int arr[] = {7, 6, 9, 2, 1};
        int k = 3;
        solve(arr,k);
    }
    public static void solve(int[] arr,int k){
        for(int i=0 ; i<arr.length-1 && k>0; ++i){
            int pos = i;
            for(int j=i+1 ; j<arr.length ; ++j){
                if(j-i>k){
                    break;
                }
                if(arr[j]<arr[pos]){
                    pos=j;
                }
            }
            int temp;
            for(int j=pos ; j>1 ; --j){
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
            k-=pos-i;
        }
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        //System.out.println();
    }
}
