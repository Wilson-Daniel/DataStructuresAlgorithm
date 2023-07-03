package DataStructuresAlgorithm.HASHMAP;

import java.util.*;

public class HASHMAP_Top_K_Frequent_Elements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k=2;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else {
                hm.put(nums[i],1);
            }
        }

        Set<Integer> keys = hm.keySet();
        int[] arrKey = new int[keys.size()];
        int[] arrValue = new int[keys.size()];
        int idx=0;
        for(Integer i : keys){
            arrKey[idx] = i;
            arrValue[idx] = hm.get(i);
        }
        reverse(arrKey);
        reverse(arrValue);
        int ans[] = new int[k];
        for(int i=0; i <k ; i++){
            ans[i] = arrKey[i];
        }
        for(int i=0; i <k ; i++){
            System.out.println(ans[i]);
        }



    }
    public static void reverse(int[] arr){
        int st=0;
        int end = arr.length-1;
        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
}
