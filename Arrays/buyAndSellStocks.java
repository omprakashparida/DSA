public class buyAndSellStocks {
    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStocks(price));
    }

    public static int buyAndSellStocks(int price[]) {
        int maxprofit = 0;
        int bp_miniumprice = price[0];
        for (int i = 0; i < price.length; i++) {
            bp_miniumprice = Math.min(price[i], bp_miniumprice);
            int profit = price[i] - bp_miniumprice;
            maxprofit = Math.max(maxprofit, profit);
        }
        return maxprofit;
    }
}
