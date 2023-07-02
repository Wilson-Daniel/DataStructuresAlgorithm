package DataStructuresAlgorithm.HASHMAP;

public class HASHMAP_SubArraySum_K {
    public static void main(String[] args) {
        int[] arr = {10,2,-2,-20,10};
        int sum = 0;
        int k=-10;
        int count =0;
        for(int i=0 ; i<arr.length ; i++){
            sum+=arr[i];
            if(sum==k){
                count++;
                sum=0;
            }
        }
        System.out.println(count);
    }
}
