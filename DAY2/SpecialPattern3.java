package DataStructuresAlgorithm.DAY2;

public class SpecialPattern3 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1 ; i<=n*2 ; i++){
            if(i<=n){
                for(int j=1 ; j<=i ; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }else {
                for(int j=n-1 ; j>=i-n ; j--){
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
}
