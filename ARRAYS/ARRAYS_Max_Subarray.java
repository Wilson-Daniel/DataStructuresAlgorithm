package DataStructuresAlgorithm.ARRAYS;

public class ARRAYS_Max_Subarray {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int arr2[] = {1,2,3,4,5};
        System.out.println(minSubArrayLen(7,arr2));
    }
    public static int maxSub(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        if(arr.length==1){
            return arr[0];
        }
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                int sum= 0;
                for(int k=i ; k<=j ; k++){
                    sum+=arr[k];
                }
                maxSum = Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1 ; i<nums.length ; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        for(int e:prefix){
            System.out.print(e+" ");
        }
        System.out.println();

        int minLen = Integer.MAX_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i ; j<nums.length ; j++){

                if(i==j && prefix[i]==target){
                    minLen = Math.min(minLen,1);
                }else{
                    int cs = prefix[j] - prefix[i];
                    if(cs>=target){
                        minLen = Math.min(minLen,j-i);
                    }
                }

            }
        }
        if(minLen == Integer.MAX_VALUE)
            return 0;
        return minLen;
    }

}
