package DataStructuresAlgorithm.DAY36;

public class RevisionRadixSort {
    public static int maxElem(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
    public static void radixSort(int[] arr){
        int max = maxElem(arr);
        for(int place = 1 ; max/place>0 ; place*=10){
            countSort(arr,place);
        }
    }
    public static void countSort(int[] arr,int place){
        int n = arr.length;
        int max = maxElem(arr);
        int[] count = new int[10];
        for(int i=0 ; i< n ; i++){
            int idx = (arr[i]/place)%10; // getting count idx
            count[idx]++;
        }
        for(int i=1 ; i<count.length ; i++){
            count[i]+=count[i-1];
        }
        int[] output = new int[n];
        for(int i=n-1 ; i>=0 ; i--){
            int idxval = (arr[i]/place)%10;
            int idxforOut = count[idxval]-1;
            output[idxforOut] = arr[i];
            count[idxval]-=1;
        }
        for(int i=0 ;i<n ; i++){
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {43,456,28,2,524};
        radixSort(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
