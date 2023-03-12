package DataStructuresAlgorithm.DAY_43.ASSIGNMENT;

public class Q4_ConverBinaryToDecimal {
    public static void main(String[] args) {
        String ans = convDtoB(10);
        for(int i=ans.length()-1 ; i>=0 ; i--){
            System.out.print(ans.charAt(i));
        }
    }
    public static String convDtoB(int n){
        String ans = "";
        while(n>0){
            if((n&1) ==1){
                ans+="1";
            }else{
                ans+="0";
            }
            n>>=1;
        }
        return ans;
    }
}
