package DataStructuresAlgorithm.DAY__55;

import java.util.Stack;

public class STACK_MaxAreaInHistogram {
    public static void main(String[] args) {
        long[] arr = {2,1,5,6,2,3};
        int[] arr1 = {2,1,5,6,2,3};
        maxArea(arr1);
        System.out.println(getMaxArea(arr,6));
    }
    public static void maxArea(int[] arr){
        int maxArea = 0;
        int[] nsl = new int[arr.length];
        int[] nsr = new int[arr.length];

        //next smaller left
        Stack<Integer> s = new Stack<>();
        for(int i=0 ; i<arr.length ; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //next smaller right
        s=new Stack<>();
        for(int i=arr.length-1 ; i>=0 ; i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //current area
        for(int i=0 ; i<arr.length ; i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height * width;
            maxArea = Math.max(currArea,maxArea);
        }
        System.out.println(maxArea);
    }
    public static long getMaxArea(long hist[], long n)
    {
        // your code here
        int N = hist.length;
        long maxArea =0;
        int[] nsl = new int[N];
        int[] nsr = new int[N];

        //nextsmaller left
        Stack<Integer> s = new Stack<>();
        for(int i=0 ; i<N ; i++){
            while(!s.isEmpty() && hist[s.peek()]>=hist[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //next smaller right
        s = new Stack<>();
        for(int i=N-1 ; i>=0 ; i--){
            while(!s.isEmpty() && hist[s.peek()]>=hist[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = N;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //current area
        for(int i=0 ; i<N ;i++){
            long width = nsr[i]-nsl[i]-1;
            long currArea = hist[i]*width;
            maxArea = Math.max(currArea,maxArea);
        }

        return maxArea;
    }
}
