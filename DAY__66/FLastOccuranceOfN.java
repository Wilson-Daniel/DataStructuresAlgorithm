package DataStructuresAlgorithm.DAY__66;

public class FLastOccuranceOfN {
    public static void main(String[] args) {
        int[] arr = {2,4,2,5,6,3,7,9,5,98};
        System.out.println(lastOcc(arr,5,0));
    }
    public static int lastOcc(int[] arr,int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOcc(arr,key,i+1);
        if(isFound != -1){
            return isFound;
        }
        if(arr[i] == key){
            return i;
        }
        return isFound;

    }
}
