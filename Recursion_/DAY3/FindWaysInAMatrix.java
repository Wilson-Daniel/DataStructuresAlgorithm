package Recursion.DAY3;

public class FindWaysInAMatrix {
    public static void main (String[] args){
        System.out.println("Ways: "+ matrix(3,3));
    }
    public static int matrix(int a,int b){
        if(a==1 || b==1){
            return 1;
        }
        return matrix(a-1,b)+matrix(a,b-1);
    }

}
