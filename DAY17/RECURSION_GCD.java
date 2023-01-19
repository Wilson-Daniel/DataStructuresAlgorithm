package DataStructuresAlgorithm.DAY17;

public class RECURSION_GCD {
    public static void main(String[] args) {
        System.out.println(GCD(24,15));
        System.out.println(euclidGCD(24,15));
    }
    public static int euclidGCD(int x,int y){
        if(y==0){
            return x;
        }
        return euclidGCD(y,x%y);
    }
    public static int GCD(int x,int y){
        while(x%y != 0){
//            y%=x;
//            System.out.println(y);
            //x-=y;
            int rem = x%y;
            x=y;
            y=rem;
            //System.out.println(x);

        }
        return y;

    }
}
