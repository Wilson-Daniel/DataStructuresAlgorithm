package DataStructuresAlgorithm.DAY_41;

public class PATTERN_QUESTION_NumberTriangle {
    /*
        1
       2 2
      3 3 3
     4 4 4 4
     */
    public static void numTriangle(int n,int m){
        int num =1;
        for(int i=n ; i>=1 ; i--){
            for(int j=i ; j>=1 ; j--){
                System.out.print(" ");
            }
            for(int j=num ; j>=1 ;j--){
                System.out.print(num+" ");
            }
            num++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        numTriangle(4,5);
    }
}
