package DataStructuresAlgorithm.DAY__69.ALPHA_RECURSION_REVSION;

public class FirstOccOaAnElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,5,7,8,3};
        int key  = 5;
        System.out.println(occ(arr,0,key));
    }
    public static int occ(int[] arr,int idx,int key){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == key){
            return idx;
        }
        return occ(arr,idx+1,key);
    }
}
