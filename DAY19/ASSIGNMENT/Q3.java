package DataStructuresAlgorithm.DAY19.ASSIGNMENT;

public class Q3 {
//    Given an array of size n, generate and print all possible combinations of r elements in array. (Hard)
//    Input1:
//    n = 4
//    {1, 2, 3, 4}
//    r = 2
//    Output1:
//    {1, 2}
//    {1, 3}
//    {1, 4}
//    {2, 3}
//    {2, 4}
//    {3, 4}
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        combinations(arr,0);
    }
    public static void combinations(int[] arr,int idx){
        if(idx == arr.length-2){
            return;
        }
        int[] ans = new int[arr.length-1-idx];
        for(int i=idx ; i<arr.length ; i++){
            for(int j=i+1 ;j<arr.length ; j++ ){
                ans[i] = arr[j];
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
        combinations(ans,idx+1);
    }
}
