package DataStructuresAlgorithm.PRIORITY_QUEUE;

import java.util.PriorityQueue;

public class PRIORITYQUEUE_K_closest_elements {
    static int[] printKClosest(int[] arr, int n, int k, int x) {
        // code here
        PriorityQueue<Close> pq = new PriorityQueue<>();
        for(int i=0 ; i<arr.length ; i++){
            int diff = arr[i]-x;
            pq.add(new Close(i,diff));
        }
        for(Close i : pq){
            System.out.println(i.idx+" "+i.diff);
        }
        int[] ans = new int[k];
        for(int i=0 ; i<k ; i++){
            ans[0] = arr[pq.remove().idx];
        }
        return ans;
    }
    public static class Close implements Comparable<Close>{
        int idx;
        int diff;
        Close(int idx,int diff){
            this.idx = idx;
            this.diff = diff;
        }
        @Override
        public int compareTo(Close s2){
            return this.diff - s2.diff;
        }

    }
    public static void main(String[] args) {
        int N = 13;
        int arr[] = {12, 16, 22, 30, 35, 39, 42,
                45, 48, 50, 53, 55, 56};
        int K = 4, X = 35;
        int[] ans = printKClosest(arr,N,K,X);
        for(int i: ans){
            System.out.println(i);
        }
    }
}
