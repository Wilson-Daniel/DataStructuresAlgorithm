package DataStructuresAlgorithm.DAY5;

class ArrayOcc{
    public void lastOccurance(int[] arr,int x){
        int index = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(x == arr[i]){
                index = i;
            }
        }
        System.out.println(index);
    }
    public void isSorted(int[] arr){
        boolean ans = true;
        for(int i=0 ; i <arr.length-1 ; i++){
            if(arr[i] > arr[i+1]){
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}

public class ARRAYSLastOccuranceOfX {
    public static void main(String[] args) {
        int[] arr2 = {5,3,4,6,5,8,9,5};
        int[] arr3 = {1,2,3,5,5,6};
        ArrayOcc arrayOcc = new ArrayOcc();
        arrayOcc.lastOccurance(arr2,9);
        arrayOcc.isSorted(arr3);
    }
}
