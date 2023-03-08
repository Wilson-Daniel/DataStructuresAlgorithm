package DataStructuresAlgorithm.DAY_41;

public class PATTERN_QUESTION_Diamond {
    public static void diamond(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n-i ; j++){//for spaces
                System.out.print("_ ");
            }
            for(int j=1 ; j<=(i*2)-1 ; j++){ // for star
                System.out.print("* ");
            }
            System.out.println();
        }
        //second half
        for(int i=n ; i>=1 ; i--){
            for(int j=1 ; j<=n-i ; j++){ //for spaces
                System.out.print("_ ");
            }
            for(int j=1 ; j<=(i*2)-1 ; j++){ //for star
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond(4);
    }
}
