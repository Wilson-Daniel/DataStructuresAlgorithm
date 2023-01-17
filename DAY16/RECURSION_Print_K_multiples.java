package DataStructuresAlgorithm.DAY16;

public class RECURSION_Print_K_multiples {
    public static void main(String[] args) {
        printK(5,4);
    }
    public static void printK(int n, int k){
        if(k==0){
            return;
        }
        //Recursive Work
        printK(n,k-1); //5 10 15
        //Self Work
        System.out.print(n*k+" "); //20

    }
}
