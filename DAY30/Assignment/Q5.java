package DataStructuresAlgorithm.DAY30.Assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q5 {

    public static int minSum(int[] arr){
        Arrays.sort(arr);
        int a = 0;
        int b = 0;
        for(int i=0 ; i< arr.length ; i++){
            if(i%2 == 0){
                a=a*10+arr[i];
            }else{
                b=b*10+arr[i];
            }
        }
        return a+b;
    }
    public static void main(String[] args) {
        int[] arr ={6,8,4,5,2,3};
        System.out.println(minSum(arr));
    }
}
