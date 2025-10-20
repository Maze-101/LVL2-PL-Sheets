package sheet3;

public class Stock {
    private String symbol , name;
    private double previousClosingPrice , currentPrice;

    Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    Stock(double previousClosingPrice, double currentPrice){
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    Stock(){
        this(0.0,0.0);
    }

    public double getChangePercent(){
        return Math.abs(previousClosingPrice - currentPrice) / 100.0;
    }
}