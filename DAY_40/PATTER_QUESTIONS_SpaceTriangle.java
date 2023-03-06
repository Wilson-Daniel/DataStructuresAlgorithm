package DataStructuresAlgorithm.DAY_40;

public class PATTER_QUESTIONS_SpaceTriangle {
    /*
          *
        * *
      * * *
    * * * *
     */
    public static void main(String[] args) {
        spaceRec.printShape(4,5);
    }

}
class spaceRec{
    public static void printShape(int n,int m){
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=m ; j++) {
                if (j <= m - i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

