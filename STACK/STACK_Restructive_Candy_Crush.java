package DataStructuresAlgorithm.STACK;

import java.util.Stack;

public class STACK_Restructive_Candy_Crush {
    public static String reduced_String(int k, String s)
    {
        if (k == 1) {
            // all elements remove,send empty string
            return "";
        }

        // Creating a stack of type Pair
        Stack<Pair> st = new Stack<Pair>();

        // Length of the string S
        int l = s.length();
        int ctr = 0;

        // iterate through the string
        for (int i = 0; i < l; i++) {
            // if stack is empty then simply add the
            // character with count 1 else check if
            // character is same as top of stack
            if (st.size() == 0) {
                st.push(new Pair(s.charAt(i), 1));
                continue;
            }

            // if character at top of stack is same as
            // current character increase the number of
            // repetitions in the top of stack by 1
            if (st.peek().ch == s.charAt(i)) {
                Pair p = st.peek();
                st.pop();
                p.freq += 1;
                if (p.freq == k) {
                    continue;
                }
                else {
                    st.push(p);
                }
            }
            else {
                st.push(new Pair(s.charAt(i), 1));
            }
        }

        // iterate through the stack
        // append characters in String

        StringBuilder output = new StringBuilder();

        while (st.size() > 0) {
            char c = st.peek().ch;
            int cnt = st.peek().freq;
            // If frequency of a character is cnt, then
            // append that character to cnt times in String
            while (cnt-- > 0)
                output.append(String.valueOf(c));
            st.pop();
        }
        output.reverse();
        return output.toString();

    }
    static class Pair{
        char ch;
        int freq;
        Pair(char ch,int freq){
            this.ch = ch;
            this.freq =freq;
        }
    }

    public static void main(String[] args) {
        System.out.println(reduced_String(2,"geeeksforgeeks"));
    }
}
