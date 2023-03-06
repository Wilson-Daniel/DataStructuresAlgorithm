package DataStructuresAlgorithm.DAY_40;

public class PATTER_QUESTIONS_01Triangle {
    /*
    1
    0 1
    1 0 1
    0 1 0 1
     */
    public static void main(String[] args) {
        Triangle.printRec(4,5);
    }
}
class Triangle{
    public static void printRec(int n,int m){
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
