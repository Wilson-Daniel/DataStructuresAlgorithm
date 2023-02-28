package DataStructuresAlgorithm.DAY38;

public class BinarySearch {

    public static boolean binarySearch(int[] arr,int target){
        int n= arr.length;
        int st=0,end=n-1;
        while(st<=end){
            int mid = (st+end)/2;
            if(arr[mid] == target){
                return true;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return false;
    }
    public static boolean recursiveBinary(int[] arr,int target,int st,int end){
        if(st>end) return false; // base case

        int mid = (st+end)/2;
        if(target == arr[mid]){
            return true;
        }else if(target < arr[mid]){
            return recursiveBinary(arr,target,st,mid-1);
        }else {
            return recursiveBinary(arr, target, mid + 1, end);
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0,5};
        int target = 0;

        while(target != 10){
            System.out.printf("%d exists in arr: %b \n", target, recursiveBinary(arr,target,0,arr.length-1));
            target++;
        }
    }
}
