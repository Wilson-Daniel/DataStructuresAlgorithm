package DataStructuresAlgorithm.ARRAYS;

public class ARRAYS_Buy_And_sell_Stocks {
    public static void main(String[] args) {
        int[] stocks = {7,1,5,3,6,4};
        int buyPrice = Integer.MAX_VALUE;
        int CompanyProfit = 0;
        for(int i=0 ; i<stocks.length ; i++){
            if(buyPrice<stocks[i]) {
                CompanyProfit = Math.max(CompanyProfit, (stocks[i] - buyPrice));
            }else{
                buyPrice = stocks[i];
            }
        }
        System.out.println("Total Profit was on day: "+CompanyProfit);
    }
}
