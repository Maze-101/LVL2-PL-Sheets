package sheet3;

public class Stock {
    private String symbol , name;
    private double previousClosingPrice , currentPrice;

    Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }
    
    public void setPrevious(double prev){
        this.previousClosingPrice = prev;
    }

    public void setCurrent(double curr){
        this.currentPrice = curr;
    }

    public double getChangePercent(){
        return Math.abs(previousClosingPrice - currentPrice) / 100.0;
    }

    public static void main(String[] args) {
        Stock s = new Stock("ORCL","Oracle Corporation");

        s.setPrevious(34.5);
        s.setCurrent(34.35);

        System.out.printf("The price change : %f\n", s.getChangePercent());
    }
}