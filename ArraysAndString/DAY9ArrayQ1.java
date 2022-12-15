package ArraysAndString;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class DAY9ArrayQ1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(4);
        array.add(5);
        array.add(8);
        boolean ans = false;
        int a =0;
        ArrayList<Integer> arrayans = new ArrayList<>();
        Collections.sort(array);
        for(int i=0 ; i<array.size()/2 ; i++){
                if(array.get(2 * i + 1) == 2 * array.get(2 * i)){
                    arrayans.add(array.get(2*i+1));
                    array.remove(2*i+1);
                    arrayans.add(array.get(2*i));
                    array.remove(2*i);
                    System.out.println(array.size());
                    ans = true;


                }else{
                    return;
                }
        }
        System.out.println(ans);



    }
}
