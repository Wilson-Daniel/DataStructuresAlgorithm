package DataStructuresAlgorithm.DAY_41;

public class PATTERN_QUESTION_NumberTriangle2 {
    /*
          1
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4

     */
    public static void triangle(int n,int m){
        int num = 1;
        for(int i=n ; i>=1 ; i--){
            for(int j=i ; j>=1 ; j--){
                System.out.print("  ");
            }
            for(int j=num ;j>=1 ; j--){
                System.out.print(j+" ");
            }
            for(int j=1 ;j<=num ; j++){
                if(j>1){
                    System.out.print(j+" ");
                }
            }
            num++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangle(4,5);
    }
}
