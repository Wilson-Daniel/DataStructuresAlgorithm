package DataStructuresAlgorithm.DAY33;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BucketSort {

    public static void bucketSort(float[] arr){
        int n = arr.length;
        //creating a Bucket
        ArrayList<Float>[] buckets = new ArrayList[n];
        //creating a 2D bucket
        for(int i=0 ; i<n ; i++){
            buckets[i] = new ArrayList<Float>();
        }
        //Adding elements into bucket
        for(int i=0 ; i<n ; i++){
            int bucketIndex = (int)arr[i]*n;
            buckets[bucketIndex].add(arr[i]);
        }
        //Sort the bucket individually
        for(int i=0 ; i< buckets.length ; i++){
            Collections.sort(buckets[i]);
        }

        //Merge all the buckets into single
        int k=0;
        for(int i=0 ; i<buckets.length ; i++){
            ArrayList<Float> curentBucket = buckets[i];
            for(int j=0 ; j<curentBucket.size() ; j++){
                arr[k++] = curentBucket.get(j);
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
