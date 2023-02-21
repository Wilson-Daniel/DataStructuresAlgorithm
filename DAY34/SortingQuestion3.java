package DataStructuresAlgorithm.DAY34;

public class SortingQuestion3 {
    /*
    Given an array of size N containing only Os, 1s, and 2s; sort the array in ascending order.
        Input:  N=6
                arr[]= {0 2 1 2 0 0}
        Output: 000122
     */
    public static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void sort012(int[] a){
        int l = 0, mid =0, h = a.length-1;

        //exploring the unknown region
        while(l<=h){
            if(a[mid] == 0){
                swap(a,mid,l);
                mid++;
                l++;
            }else if(a[mid] == 1){
                mid++;
            }else{
                swap(a,mid,h);
                h--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,0,0,0,1,1,2,2};
        sort012(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

}
