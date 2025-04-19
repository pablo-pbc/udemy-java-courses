package entities;

public class CurrencyConverter {

    public double dollarPrice;
    public double dollarBought;
    public final double IOF = 1.06;

    public double amountPaidReal() {
        return dollarPrice * dollarBought * IOF;
    }
}
