package DataStructuresAlgorithm.DAY__57;

import java.util.Stack;

public class Q3_Decode_A_String {
    public static void main(String[] args) {
        String str = "3[b2[v]]";
        String org = decode1(str);
        System.out.println(org);
    }

    public static String decode(String str) {
        Stack<Integer> IntStack = new Stack<>();
        Stack<Character> StringStack = new Stack<>();
        String temp = "",result="";
        for(int i=0 ; i<str.length() ; i++){
            int count = 0;
            if(Character.isDigit(str.charAt(i))){
                while(Character.isDigit(str.charAt(i))){
                    count=count * 10 + str.charAt(i)-'0';
                    i++;
                }
                i--;
                IntStack.push(count);
            }else if(str.charAt(i)==']'){
                temp="";
                count = 0;
                if(!IntStack.isEmpty()){
                    count = IntStack.peek();
                    IntStack.pop();
                }
                if(!StringStack.isEmpty() && str.charAt(i)!=']'){
                    temp = temp+StringStack.peek();
                    StringStack.pop();
                }
                if(!StringStack.isEmpty() && str.charAt(i)==']'){
                    StringStack.pop();
                }
                for(int j=0 ; j<count ; j++){
                    result = result+temp;
                }
                for(int j=0; j<result.length() ; j++){
                    StringStack.push(result.charAt(j));
                }
                result = "";

            } else if(str.charAt(i)=='['){
                if(Character.isDigit(str.charAt(i-1))){
                    StringStack.push(str.charAt(i));
                }else{
                    StringStack.push(str.charAt(i));
                    IntStack.push(1);
                }
            }else{
                StringStack.push(str.charAt(i));
            }
        }
        while(!StringStack.isEmpty()){
            result = result+StringStack.peek();
            StringStack.pop();
        }
        return result;
    }

    static String decode1(String str) {
        Stack<Integer> integerstack = new Stack<>();
        Stack<Character> stringstack = new Stack<>();
        String temp = "", result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (Character.isDigit(str.charAt(i))) {
                while (Character.isDigit(str.charAt(i))) {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }
                i--;
                integerstack.push(count);
            } else if (str.charAt(i) == ']') {
                temp = "";
                count = 0;
                if (!integerstack.isEmpty()) {
                    count = integerstack.peek();
                    integerstack.pop();
                }
                while (!stringstack.isEmpty() && stringstack.peek() != '[') {
                    temp = stringstack.peek() + temp;
                    stringstack.pop();
                }
                if (!stringstack.empty() && stringstack.peek() == '[')
                    stringstack.pop();
                for (int j = 0; j < count; j++)
                    result = result + temp;
                for (int j = 0; j < result.length(); j++)
                    stringstack.push(result.charAt(j));
                result = "";
            } else if (str.charAt(i) == '[') {
                if (Character.isDigit(str.charAt(i - 1)))
                    stringstack.push(str.charAt(i));
                else {
                    stringstack.push(str.charAt(i));
                    integerstack.push(1);
                }
            } else
                stringstack.push(str.charAt(i));
        }
        while (!stringstack.isEmpty()) {
            result = stringstack.peek() + result;
            stringstack.pop();
        }
        return result;
    }
}