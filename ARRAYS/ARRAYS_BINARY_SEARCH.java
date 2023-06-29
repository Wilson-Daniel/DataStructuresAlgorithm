package DataStructuresAlgorithm.ARRAYS;

public class ARRAYS_BINARY_SEARCH {
    public static void main(String[] args) {
        int[] arr = {3,2,5,6,7,2,8};
        System.out.println(binarySearch(arr,8));
    }
    public static int binarySearch(int[] arr,int key){
        int st =0;
        int end = arr.length-1;
        while(st<=end){
            int mid = (st+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(key>arr[mid]){
                st=mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
