package DataStructuresAlgorithm.DAY36;

import java.util.ArrayList;
import java.util.Collections;

public class RevisionBucketSort {
    public static void bucketSort(float[] arr){
        int n = arr.length;
        ArrayList<Float>[] buckets = new ArrayList[n];
        //creating a 2D bucket
        for(int i=0 ; i<n ; i++){
            buckets[i] = new ArrayList<Float>();
        }
        for(int i=0 ; i<n ; i++){
            int bucketIndex = (int) arr[i] * n;
            buckets[bucketIndex].add(arr[i]);
        }
        for(int i=0 ; i<buckets.length ; i++){
            Collections.sort(buckets[i]);
        }
        int k=0;
        for(int i=0 ; i<buckets.length ; i++){
            ArrayList<Float> currentBuc = buckets[i];
            for(int j = 0 ; i<currentBuc.size() ; i++){
                arr[k++] += currentBuc.get(j);
            }

        }
    }
    public static void main(String[] args) {
        float[] arr = {0.1f, 0.2f, 0.56f, 0.46f, 0.35f, 0.9f};
        bucketSort(arr);
        for(float i : arr){
            System.out.print(i+ " ");
        }
    }
}
