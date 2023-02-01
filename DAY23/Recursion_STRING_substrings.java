package DataStructuresAlgorithm.DAY23;

import javax.swing.table.TableCellEditor;

public class Recursion_STRING_substrings {
    public static void main(String[] args) {
        printSQQ("abc","");
    }
    public static void printSQQ(String s,String currAns){
        if(s.length() == 0){
            System.out.println(currAns);
            return;
        }
        char a = s.charAt(0);
        String remString = s.substring(1);
        printSQQ(remString,currAns+a);
        printSQQ(remString,currAns);

    }

}
