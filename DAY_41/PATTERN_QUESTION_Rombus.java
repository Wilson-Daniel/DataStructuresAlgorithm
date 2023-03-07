package DataStructuresAlgorithm.DAY_41;

public class PATTERN_QUESTION_Rombus {
    /*
        * * * * *
       * * * * *
      * * * * *
     * * * * *
     */
    public static void rombus(int n,int m){
        for(int i=n ; i>=1 ; i--){
            for(int j=i ; j>=1 ; j--){
                System.out.print("  ");
            }
            for(int j=1 ; j<=n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rombus(4,5);
    }
}
