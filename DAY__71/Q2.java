package DataStructuresAlgorithm.DAY__71;

public class Q2 {
    public static void main(String[] args) {

        int[] nums = {17, 19, 9, 5, 3, 6, 17, 7, 18, 16, 18, 11, 3, 15, 2};
        //int[] nums = {2,2,1,1,1,1,1,2,2,};
        System.out.println(majorityElementRes(nums,0, nums.length-1));
    }

    public static int majorityElementRes(int[] nums, int lo,int hi){
        if(lo == hi){
            return nums[lo];
        }
        int mid = lo+(hi-lo)/2;
        //recurse for left and right part
        int left = majorityElementRes(nums,lo,mid);
        int right = majorityElementRes(nums,mid+1,hi);
        //if both agrees then return
        if(left == right){
            return left;
        }
        //else count each element and return the "winner"
        int leftCount = countInRange(nums,left,lo,hi);
        int rightCount = countInRange(nums,right,lo,hi);
        return leftCount>rightCount ? left : right ;

    }
    public static int countInRange(int[] nums,int num,int lo,int hi){
        int count = 0;
        for(int i=lo ; i<=hi;i++){
            if(nums[i] == num){
                count++;
            }
        }
        if(count < hi/2){
            return -1;
        }
        return count;
    }

}
