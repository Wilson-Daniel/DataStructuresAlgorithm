package DataStructuresAlgorithm.DAY19;

public class RECURSION_ARRAY_Find_an_element_in_array {
    //Given an array find an element x using recursion
    // n = 8
    // arr = {4,12,54,1,2,3,4,5}
    // x = 14
    // answer YES or No
    public static void main(String[] args) {
        int n = 8;
        int[] arr = {4,12,54,1,2,3,4,5};
        int x = 4;
        if(LinearSearch(arr,0,x) == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(returnIndex(arr,n,0,x));
        allIndex(arr,n,0,x);
    }
    public static boolean LinearSearch(int[] arr, int idx, int x){
        //Base Case
        if(idx == arr.length){
            return false;
        }
        //Selfwork
        if(arr[idx] == x){
            return true;
        }
        //Recursion Work
        return LinearSearch(arr,idx+1,x);//asking rest of array to find, if there is it will return true or false
             //true or false will come and return directly
    }

    //SAME QUESTION NOW RETURN THE INDEX OF MATCHED POSITION
    public static int returnIndex(int[] arr,int n,int idx,int x){
        //base case
        if(idx == arr.length){
            return -1;
        }
        //self-work
        if(arr[idx] == x){
            return idx;
        }
        //Recursion-Work
        return returnIndex(arr,n,idx+1,x);
    }
    //SAME QUESTION RETURN ALL INDEX
    public  static void allIndex(int[] arr, int n, int idx, int x){
        //base case
        if(idx == n){
            return;
        }
        //self work
        if(arr[idx] == x){
            System.out.print(idx+" ");
        }
        //recursive work
        allIndex(arr,n,idx+1,x);
    }
}
