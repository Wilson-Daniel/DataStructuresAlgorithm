package DataStructuresAlgorithm.DAY38;

public class Find_the_first_occurance {
    public static void main(String[] args) {
        int[] arr = {2,5,6,6,7,8,8,9};
        int x = 8;
        int id = occurance(arr,x,0,arr.length-1);
        System.out.println(id);
    }
    public static int occurance(int[] arr,int target,int st,int end){
        if(st>end){
            return -1;
        }
        int mid = st+(end-st)/2;
        if(arr[mid] == target){
            return mid;
        }else if(target<arr[mid]){
            return occurance(arr,target,st,mid-1);
        }else{
            return occurance(arr,target,mid+1,end);
        }
    }
}
