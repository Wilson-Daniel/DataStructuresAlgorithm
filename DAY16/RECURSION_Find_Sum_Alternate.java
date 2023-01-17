package DataStructuresAlgorithm.DAY16;

import java.sql.SQLOutput;

public class RECURSION_Find_Sum_Alternate {
    public static void main(String[] args) {
        System.out.println(altSum(10));
    }
    //Given an no. n find alternate sum
    //n=5   1-2+3-4+5 = 3
    public static int altSum(int n){

        if(n==0){
            return 0;
        }
        //recursive work
        int rec= altSum(n-1);
        //selfwork
        int ans =0;
        if(n%2 == 0){
            ans-=n;
        }else{
            ans+=n;
        }
        return rec+ans;
    }
}
