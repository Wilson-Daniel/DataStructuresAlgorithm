package DataStructuresAlgorithm.DAY_40;

public class PATTER_QUESTIONS_HollowRectangle {
    /*print hollow rectangle ******
                             *    *
                             *    *
                             ******
    */
    public static void main(String[] args) {
        holoRect(5,4);
    }
    public static void holoRect(int n,int m){
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(i==0 || i==n-1 || j==0 || j==m-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
