package DataStructuresAlgorithm.DAY3;

public class ArraysAverage {
    public static void main(String[] args) {
        int[] arr = {5,5,5,5};
        int sum=0;
        for(int i=0 ; i<arr.length ; i++){
            sum+=arr[i];
        }
        int average = sum/arr.length;
        System.out.println(average);
    }
}
