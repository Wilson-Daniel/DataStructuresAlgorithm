package DataStructuresAlgorithm.DAY__76;

public class BackTrackingOnArrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        fillArray(arr,0);
        printArr(arr);
        a ss = new a();
        ss.chec();
        ss.check2();
    }
    public static void fillArray(int[] arr,int idx){
        //base case
        if(idx == arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[idx] = idx+1;
        fillArray(arr,idx+1);
        arr[idx] -= 2;
    }
    public static void printArr(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

}
class a{
    public static void chec(){
        System.out.println("Static access");
    }
    public void check2(){
        System.out.println("NonStatic access");
    }
}
