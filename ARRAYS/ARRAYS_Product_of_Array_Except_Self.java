package DataStructuresAlgorithm.ARRAYS;

public class ARRAYS_Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1,2};
        int[] ans = cal(nums);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    public static int[] cal(int[]nums){
        int[] ans = new int[nums.length];
        for(int i=0 ;i<nums.length ; i++){
            int sum = 1;
            for(int j=0 ; j<nums.length ; j++){
                if(nums[j] != nums[i]){
                    sum*=nums[j];
                }
            }
            ans[i] = sum;
        }
        return ans;
    }
}
