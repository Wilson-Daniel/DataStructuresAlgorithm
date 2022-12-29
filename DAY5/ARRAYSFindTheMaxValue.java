package DataStructuresAlgorithm.DAY5;
class ArraysExample{
    void maxOfArrays(int[] arr){
        int max = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max Is: "+max);
    }
}

public class ARRAYSFindTheMaxValue {
    public static void main(String[] args) {
        int[] arr = {0,89,89,6};
        ArraysExample arraysExample = new ArraysExample();
        arraysExample.maxOfArrays(arr);
    }
}
