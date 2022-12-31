package DataStructuresAlgorithm.DAY7;

import java.util.Scanner;

public class FREQUE_ARRAY_Check_If_No_Is_Present_Or_Not {
    public static int[] makeFreqArray(int[] arr){
        int[] freq = new int[100005];
        for(int i=0 ; i<arr.length ; i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,76,4,5,8};
        int[] freq = makeFreqArray(arr);
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q>0){
            System.out.println("Enter a No: ");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            q--;
        }
    }

}
