package DataStructuresAlgorithm.DAY__59;

import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int[] stock = {100,80,60,70,60,85,100};
        int[] span  = new int[stock.length];
        stockSpan(stock,span);
        for(int i:span){
            System.out.print(i+" ");
        }
    }
    public static void stockSpan(int[] stock,int[] span){
        Stack<Integer> ss = new Stack<>();
        span[0] = 1;
        ss.push(0);

        for(int i=1 ; i<stock.length ; i++){
            int currPrice = stock[i];
            while(!ss.isEmpty() && currPrice>=stock[ss.peek()]){
                ss.pop();
            }
            if(ss.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = ss.peek();
                span[i] = i-prevHigh;
            }
            ss.push(i);


        }
    }
}
