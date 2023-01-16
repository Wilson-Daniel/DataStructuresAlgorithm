package DataStructuresAlgorithm.DAY14;

public class RECURSION_p_raise_to_q {
    public static void main(String[] args) {
        System.out.println(power(4,2));
        System.out.println(pow(4,2));
    }
    //Given a No. p & q, find p^q
    public static int power(int p,int q){
        if(q==0){
            return 1;
        }
//        int power = power(p,q-1)*p;
//        return power;
        return power(p,q-1)*p;
    }
    //optimised method
    public static int pow(int p,int q){
        if (q==0) {
            return 1;
        }
        int smallpow = pow(p,q/2);
        if(q%2==0){
            return smallpow * smallpow;
        }else{
            return smallpow*smallpow*p;
        }
    }
}
