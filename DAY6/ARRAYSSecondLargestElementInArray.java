package DataStructuresAlgorithm.DAY6;

public class ARRAYSSecondLargestElementInArray {
    public static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    public static int seczmax(int[] arr){
        int mx = findMax(arr);
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int smx = findMax(arr);
        return smx;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,-1,-2,0,0,-5};
        System.out.println(seczmax(arr));
    }
}
