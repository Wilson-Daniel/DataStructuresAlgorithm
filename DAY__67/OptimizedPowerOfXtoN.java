package DataStructuresAlgorithm.DAY__67;

public class OptimizedPowerOfXtoN {
    public static void main(String[] args) {
        System.out.println(optimizedPower(5,3));
    }
    public static int optimizedPower(int x,int n){
        if(n==0){
            return 1;
        }
        //int xpower = optimizedPower(x,n/2)*optimizedPower(x,n/2); //O(n)
        int halfPower = optimizedPower(x,n/2);
        int halfPowerSq = halfPower*halfPower; //O(logn)
        if(n%2!=0){
            halfPowerSq = x*halfPowerSq;
        }
        return halfPowerSq;
    }
}
