package DataStructuresAlgorithm.DAY3;

public class FindNoOFDigits {
    public static void main(String[] args) {
        int num = 1234;
        int digits = (int) Math.log10(num)+1;
        System.out.println(digits);
    }
}
