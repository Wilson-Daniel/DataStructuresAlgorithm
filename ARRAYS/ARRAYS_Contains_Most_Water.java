package DataStructuresAlgorithm.ARRAYS;

public class ARRAYS_Contains_Most_Water {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
        System.out.println((height[5]-height[1]));
    }
    public static int maxArea(int[] height) {
        int left=0 ;
        int right = height.length-1;
        int maxArea = 0;
        while(left<right){
            int currAre = Math.min(height[left],height[right])*(right-left);
            System.out.println(right-left);
            maxArea = Math.max(maxArea,currAre);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
