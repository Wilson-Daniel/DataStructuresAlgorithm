package DataStructuresAlgorithm.SORTING_ALGORITHMS;

import java.util.Arrays;

public class SORTING_ALGORITHM_Reversing_Subarray_makes_array_sorted {
    public static boolean isSorted(int arr[]){
        int[] temp = arr;
        Arrays.sort(temp);

        int i;
        for(i=0 ; i<arr.length ; i++){
            if(arr[i]!=temp[i]){
                break;
            }
        }
        int j;
        for( j=arr.length-1 ; j>=0 ; j--){
            if(arr[j]!=temp[j]){
                break;
            }
        }
        if(i>=j){
            return true;
        }
        do {
            i++;
            if (arr[i - 1] < arr[i]) {
                return false;
            }
        } while (i != j);

        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3};
        System.out.println(isSorted(arr));
        System.out.println(sortArr(arr, arr.length));
    }

    static boolean sortArr(int[] a, int n) {
        int x = -1;
        int y = -1;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                if (x == -1) {
                    x = i;
                }
                y = i + 1;
            }
        }

        if (x != -1) {
            reverse(a,x,y);
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    return false;
                }
            }
        }

        return true;
    }
    static void reverse(int[] a,int x,int y) {
        while(x<y)
        {
            int temp = a[x];
            a[x] = a[y];
            a[y] = temp;
            x++;
            y--;
        }
    }
    static boolean checkReverse(int arr[], int n) {
        // Copying the array.
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        // Sort the copied array.
        Arrays.sort(temp);

        // Finding the first mismatch.
        int front;
        for (front = 0; front < n; front++) {
            if (temp[front] != arr[front]) {
                break;
            }
        }

        // Finding the last mismatch.
        int back;
        for (back = n - 1; back >= 0; back--) {
            if (temp[back] != arr[back]) {
                break;
            }
        }

        // If whole array is sorted
        if (front >= back) {
            return true;
        }

        // Checking subarray is decreasing or not.
        do {
            front++;
            if (arr[front - 1] < arr[front]) {
                return false;
            }
        } while (front != back);

        return true;
    }
}
