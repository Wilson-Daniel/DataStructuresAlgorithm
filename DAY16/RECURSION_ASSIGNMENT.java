package DataStructuresAlgorithm.DAY16;

public class RECURSION_ASSIGNMENT {
    public static void main(String[] args) {
        pattern(16);
        System.out.println(summation(4,1));
    }
    public static void pattern(int n){
        if(n<=0){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        pattern(n-5);
        System.out.print(n+" ");
    }
    public static int summation(int n,int m){
        if(m==1){// for calculating m
            if(n==0){ // for calculating n
                return 0;
            }
            //selfwork + recursive work
            return n+summation(n-1,m);
        }
        //recursive work
        return summation(summation(n,m-1),1);
    }
}
