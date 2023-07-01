package DataStructuresAlgorithm.HASHMAP;

import DataStructuresAlgorithm.ARRAYS.ARRAYS_Chocolate_Distribution;

import java.util.ArrayList;
import java.util.HashMap;

public class HASHMAP_MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,2};
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0 ; i<arr.length ; i++){
            int num = arr[i];
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
//                if(updateval>=arr.length/3){
//                    ans.add(arr[i]);
//                }
//                hm.put(arr[i],updateval);
            }else {
                hm.put(arr[i], 1);
            }
        }
        System.out.println(ans);
    }
}
