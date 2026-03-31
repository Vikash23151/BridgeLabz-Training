package StockPriceLogger;

import java.util.Arrays;
import java.util.List;

public class StockLogger {
    public static void main(String[] args) {
        List<Stock> stockFeed = Arrays.asList(
                new Stock("TCS", 3850.50),
                new Stock("INFY", 1620.75),
                new Stock("RELIANCE", 2925.40),
                new Stock("HDFC", 1685.20),
                new Stock("ITC", 465.10)
        );

        System.out.println("Live Stock Price Updates:");
        stockFeed.stream()
                 .forEach(stock -> System.out.println(stock.price));
    }
}
