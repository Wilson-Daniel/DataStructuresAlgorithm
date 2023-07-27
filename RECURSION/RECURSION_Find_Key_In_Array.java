package DataStructuresAlgorithm.RECURSION;

public class RECURSION_Find_Key_In_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5,7};
        System.out.println(findfirstOcc(arr,0,8));
        System.out.println(findLastOcc(arr,0,7,0));
    }
    public static int findfirstOcc(int[] arr,int idx,int key){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]== key){
            return idx;
        }
        return findfirstOcc(arr,idx+1,key);
    }
    public static int findLastOcc(int[] arr,int idx,int key,int ans){
        if(idx==arr.length){
            return ans;
        }
        if(arr[idx]== key){
            ans= idx;
        }
        return findLastOcc(arr,idx+1,key,ans);
    }
}
