package DataStructuresAlgorithm.STACK;

import java.util.Stack;

public class STACK_Count_No_Premu_Greater {

    static int countNumber(int n)
    {
        int result = 0;

        // Pushing 1 to 9 because all number from 1
        // to 9 have this property.
        Stack<Integer> s = new Stack<>();
        for (int i = 1; i <= 9; i++){
            if (i <= n) {
                s.push(i);
                result++;
            }
            // take a number from stack and add
            // a digit greater than or equal to last digit
            // of it.
            while (!s.empty()) {
                int tp = s.pop();
                System.out.println(tp);
                for (int j = tp % 10; j <= 9; j++) {
                    System.out.print(tp+" ");
                    int x = tp * 10 + j;
                    if (x <= n) {
                        s.push(x);
                        result++;
                    }
                }
                System.out.println();
            }
        }
        return result;
    }

    // Driven Code
    public static void main(String[] args) {
        int n = 15;
        System.out.println(countNumber(n));
    }
}
