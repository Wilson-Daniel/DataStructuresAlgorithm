package DataStructuresAlgorithm.DAY34;

public class SortingQuestion2 {
    /*
    Given an array of positive and negative integers, segregate them in linear time and constant space.
    The output should print all negative numbers, followed by all positive numbers.
       Input: [19,-20, 7, -4, -13, 11, -5,3]
       Output: [-20 -4 -13 -5 7 11 19 3 ]
     */
    public static void arrange(int[] arr){
        int left=0;
        int right = arr.length-1;
        while(left<right){
            while(arr[left]<0){
                left++;
            }
            while(arr[right]>=0){
                right--;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1,3,-3,4,2,56,-45};
        arrange(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
