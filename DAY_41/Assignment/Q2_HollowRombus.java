package DataStructuresAlgorithm.DAY_41.Assignment;

public class Q2_HollowRombus {
    public static void hollow(int n){
        for(int i=n ; i>=1 ; i--){
            for(int j=i ; j>=1 ; j--){
                System.out.print("  ");
            }
            if(i==1 || i==n){
                for(int j=1 ; j<=n ; j++){
                    System.out.print("* ");
                }
            }else{
                for(int j=1 ; j<=n ; j++){
                    if(j==1 || j==n){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow(4);
    }
}
