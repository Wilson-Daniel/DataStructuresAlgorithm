package DataStructuresAlgorithm.ARRAYS;

public class ARRAYS_merge_operations_make_array_palindrome {
    public static int merge(int[] arr){
        int ans = 0;
        int i=0;
        int j = arr.length-1;
        while(i<=j){
            if(arr[i] == arr[j]){
                i++;
                j--;
            }else if(arr[i]>arr[j]){
                i++;
                arr[i+1] = arr[i+1]+arr[i];
                ans++;
            }else{
                j--;
                arr[j-1] = arr[j-1]+arr[j];
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] ans = {1,1,2,3,1};
        System.out.println(merge(ans));

    }
}
