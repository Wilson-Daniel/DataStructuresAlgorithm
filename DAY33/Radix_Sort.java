package DataStructuresAlgorithm.DAY33;

public class Radix_Sort {
    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i< arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void countSort(int[] arr,int place){
        int n = arr.length;
        int max = findMax(arr);
        //making count array
        int[] count = new int[10];
        for (int i=0 ; i<n ; i++){
            int idx = (arr[i]/place)%10;
            count[idx]++; //arr[105] -> freq[5]++  when place=1 , freq[0] when place=10 , freq[1] when place=100
        }
        ///making prefix sum in count only
        for(int i=1 ; i<count.length ; i++){
            count[i]+= count[i-1];
        }
        // find the index of each element from arr and put it in index array
        int[] output = new int[n];
        for(int i=n-1 ; i>=0 ; i--){
            int arrval = (arr[i]/place)%10;
            int trav = count[arrval] - 1;
            output[trav] =arr[i];
            count[arrval]-=1;
        }
        //copying value into output
        for(int i=0 ; i<n ; i++){
            arr[i] = output[i];
        }
    }

    public static void radixSort(int[] arr) {
        int max = findMax(arr);
        for(int place=1 ; max/place > 0 ; place*=10){
            countSort(arr,place);
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
