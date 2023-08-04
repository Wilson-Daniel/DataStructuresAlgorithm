package DataStructuresAlgorithm.LINKED_LIST;

import java.util.ArrayList;

public class LINKED_LIST_Merge_Two_LL {
    public static void main(String[] args) {
        int[] a = {5, 6, 3};
        int[] b = {8, 4, 2};
        String sum1 = "";
        for(int i=0 ; i<a.length ; i++){
            sum1+=a[i];
        }
        String sum2 = "";
        for(int i=0 ; i<b.length ; i++){
            sum2+=b[i];
        }
        int finSum = Integer.parseInt(sum1)+Integer.parseInt(sum2);

        ArrayList<Integer> ans = new ArrayList<>();
        form(finSum,ans);

        for(int e:ans){
            System.out.print(e+" ");
        }
    }
    public static void form(int sum, ArrayList<Integer> ans){
        if(sum==0){
            return;
        }
        int digit = sum%10;
        form(sum/10,ans);
        ans.add(digit);

    }
}
