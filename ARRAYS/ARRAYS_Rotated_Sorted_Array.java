package DataStructuresAlgorithm.ARRAYS;

public class ARRAYS_Rotated_Sorted_Array {
    public static void hasSum(int[] arr,int sum){
        int n=arr.length;
        int piviot = 0;
        for(int k=0 ; k<arr.length-2 ; k++){
            if(arr[k]>arr[k+1]){
                piviot = k;
            }
        }
        int i=(piviot+1) %n;
        int j=piviot;
        while(i!=j){
            if(arr[i]+arr[j] == sum){
                System.out.println(arr[i]+" "+arr[j]);
            }
            if(arr[i]+arr[j]<sum){
                j = (j+1)%n;
            }else{
                i = (n+i-1)%n;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        System.out.println(pairInSortedRotated(arr,6,21));
    }
    static boolean pairInSortedRotated(int arr[], int n,
                                       int x)
    {
        // Find the pivot element
        int i;
        for (i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1])
                break;

        // l is now index of smallest element
        int l = (i + 1) % n;

        // r is now index of largest element
        int r = i;

        // Keep moving either l or r till they meet
        while (l != r) {
            // If we find a pair with sum x, we
            // return true
            if (arr[l] + arr[r] == x)
                return true;

            // If current pair sum is less, move
            // to the higher sum
            if (arr[l] + arr[r] < x)
                l = (l + 1) % n;

                // Move to the lower sum side
            else
                r = (n + r - 1) % n;
        }
        return false;
    }
}
