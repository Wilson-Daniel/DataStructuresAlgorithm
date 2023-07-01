package DataStructuresAlgorithm.ARRAYS;

public class ARRAYS_Traping_RainWater {
    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};
        int[] greatRight = new int[arr.length];
        int[] greatLeft = new int[arr.length];
        greatRight[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2 ; i>=0 ; i--){
            greatRight[i] = Math.max(arr[i],greatRight[i+1]);
//            if(arr[i]> greatRight[i+1]){
//                greatRight[i] = arr[i];
//            }else{
//                greatRight[i] = greatRight[i+1];
//            }
        }
        greatLeft[0] = arr[0];
        for(int i=1 ; i<greatLeft.length ; i++){
            greatLeft[i] = Math.max(arr[i],greatLeft[i-1]);
//            if(arr[i]>greatLeft[i-1]){
//                greatLeft[i] = arr[i];
//            }else{
//                greatLeft[i] = greatLeft[i-1];
//            }
        }
        for(int i:greatLeft){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:greatRight){
            System.out.print(i+" ");
        }
        int totalWater = 0;
        for(int i=0 ; i < arr.length ; i++){
            int minimum = Math.min(greatRight[i],greatLeft[i]);
            totalWater+=minimum-arr[i];
        }
        System.out.println();
        System.out.println("Total water stored: "+totalWater);
    }
}
