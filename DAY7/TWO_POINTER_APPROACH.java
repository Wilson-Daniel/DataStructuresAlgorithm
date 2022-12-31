package DataStructuresAlgorithm.DAY7;

public class TWO_POINTER_APPROACH {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,0,1,1,0,0};
        int[] ans = twoPointer(arr);
        printArrays(ans);
    }
    public static int[] sort(int[] arr){
        int zeros=0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==0){
                zeros++;
            }
        }
        for(int i=0 ; i<arr.length ; i++){
            if(i<zeros){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
        return arr;
    }
    public static void printArrays(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] swapEle(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i++] = arr[j];
        arr[j--] = temp;
        return arr;
    }
    public static int[] twoPointer(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            //MY LOGIC
//            if(arr[i]<arr[j]){
//                i++;
//                j--;
//            }else if(arr[i]>arr[j]){
//                swapEle(arr,i,j);
//                i++;
//                i--;
//            }else{
//                if(arr[i]==1){
//                    j--;
//                }else{
//                    i++;
//                }
//            }
//        }
            //PW APPROACH
            if (arr[i] == 1 && arr[j] == 0) {
                swapEle(arr, i, j);
                i++;
                j--;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }
        return arr;
    }
}
