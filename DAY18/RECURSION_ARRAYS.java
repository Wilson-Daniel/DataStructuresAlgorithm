package DataStructuresAlgorithm.DAY18;

public class RECURSION_ARRAYS {
    public static void main(String[] args) {
        int[] ans = {1,2,3,4,5,6};
        System.out.println(arrayEle(ans,5));
        printEle(ans,0);
    }
    //My code
    public static int arrayEle(int[] arr,int n){
        if(n==0){
            return arr[0];
        }
        System.out.print(arr[n]+" ");
        return arrayEle(arr,n-1);
    }
    //Lecture Code
    public static void printEle(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        System.out.print(arr[idx]+" ");
        printEle(arr,idx+1);
    }
}
