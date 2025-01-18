package Java.Arrays;

public class StockPrice {
    public static int chooseStock(int price[]){
        int buyPrice = price[0];
        int maxProfit = 0;

        for(int i=1; i<price.length; i++){
            if(buyPrice < price[i]){
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            if(buyPrice > price[i] && price[i] != price[price.length - 1]){
                buyPrice = price[i];
            }
        }
        if (maxProfit <= 0){
            return 0;
        } else return maxProfit;
    }
    public static void main(String[] args) {
        int arr [] = {7,1,5,3,6,4};
        System.out.println("Maximum Profit is : " + chooseStock(arr));
    }
    
}
