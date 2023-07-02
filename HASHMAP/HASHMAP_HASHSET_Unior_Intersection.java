package DataStructuresAlgorithm.HASHMAP;

import java.util.HashSet;

public class HASHMAP_HASHSET_Unior_Intersection {
    public static void main(String[] args) {
        int arr1[]  = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        int intersection = 0;
        int union = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0 ; i<arr1.length ; i++){
            hs.add(arr1[i]);
        }
        intersection+=hs.size();
        for(int i=0 ; i<arr2.length ; i++){
            if(!hs.contains(arr2[i])){
               intersection++;
            }
        }
        System.out.println(intersection);
        for(int i=0 ; i<arr2.length ; i++){
            if(hs.contains(arr2[i])){
                union++;
                hs.remove(arr2[i]);
            }
        }
        System.out.println(union);

    }
}
