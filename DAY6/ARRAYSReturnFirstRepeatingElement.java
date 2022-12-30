package DataStructuresAlgorithm.DAY6;

public class ARRAYSReturnFirstRepeatingElement {
    public static int repEle(int[] arr){
        int ans=0;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    //HOMEWORK FIND LAST REPEATING ELEMENT
    public static int lastRepEle(int[] arr){
        int ans=-1;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    ans = arr[i];
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3};
        System.out.println(lastRepEle(arr));
    }
}
