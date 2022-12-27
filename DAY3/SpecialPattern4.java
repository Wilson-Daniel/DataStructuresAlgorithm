package DataStructuresAlgorithm.DAY3;

public class SpecialPattern4 {
    public static void main(String[] args) {
        int n=6;
        for(int i=1 ; i<=n ; i++){
            if(i==1 | i==n){
                for(int j=1 ; j<=i ; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for(int j=1 ; j<=i ; j++){
                    if(j==1 | j==i){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

        }
    }
}
