package DataStructuresAlgorithm.ARRAYS;

public class ARRAYS_Linear_Search {
    public static void main(String[] args) {
        int[] arr = {3,2,5,6,7,9,8};
        System.out.println(linearSearch(arr,9));
    }
    public static int linearSearch(int[] arr,int key){
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
