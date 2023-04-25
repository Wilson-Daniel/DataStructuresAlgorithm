package DataStructuresAlgorithm.DAY__68.RECURSION_ASSIGNMWNT;

public class Q3 {
    //write a program to find a length of a string using recursion
    public static int length(String s){
        if(s.length() == 0){
            return 0;
        }
        return length(s.substring(1))+1;
    }

    public static void main(String[] args) {
        String s = "abshcg";
        System.out.println(length(s));
    }
}
