package DataStructuresAlgorithm.DAY28.Assignment;

import java.util.Arrays;

public class Q7 {
    public static int[] index(int[] arr,int n){
        int[] ans = arr.clone();
        Arrays.sort(ans);
        for(int i=0 ; i<n ; i++){
            //System.out.println("ans"+ans[i]);
            for (int j=0 ; j<n ; j++){
                if(ans[i] == arr[j]){
                    ans[i] = j;
                    //System.out.println(ans[i]);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr ={10,40,20};
        int[] ans = index(arr,3);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
