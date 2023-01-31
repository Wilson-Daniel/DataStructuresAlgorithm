package DataStructuresAlgorithm.DAY22;

public class RECURSION_REVISE_print_allNatural_no_to_n {
    /*
    Print all natural no till n
     */
    public static void nat(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        nat(n-1);
    }

    public static void main(String[] args) {
        nat(5);
    }
}
