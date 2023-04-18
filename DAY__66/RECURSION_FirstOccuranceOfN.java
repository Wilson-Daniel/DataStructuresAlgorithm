package DataStructuresAlgorithm.DAY__66;

public class RECURSION_FirstOccuranceOfN {
    public static int occur(int[] arr,int i,int k){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == k){
            return i;
        }
        return occur(arr,i+1 , k);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,2,5,6,3,7,9,5,98};
        System.out.println(occur(arr,0,2));
    }
}
