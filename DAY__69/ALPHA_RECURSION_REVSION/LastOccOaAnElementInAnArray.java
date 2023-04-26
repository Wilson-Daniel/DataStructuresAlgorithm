package DataStructuresAlgorithm.DAY__69.ALPHA_RECURSION_REVSION;

public class LastOccOaAnElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,5,7,8,3};
        int key  = 2;
        System.out.println(lastOcc(arr,0,key));
    }
    public static int lastOcc(int[] arr,int idx,int key){
        if(idx == arr.length){
            return -1;
        }

        int subAns = lastOcc(arr,idx+1,key);
        if(subAns != -1){
            return subAns;
        }
        if(arr[idx] == key){
            return idx;
        }
        return -1;


    }
}
