package DataStructuresAlgorithm.DAY6;

public class ARRAYMANIPULATIONFindUniqueNo {
    public static int findNo(int[] arr){

        int number = 0;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>0){
                number = arr[i];
            }
        }
        return number;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1,4,5};
        System.out.println(findNo(arr));
    }
}
