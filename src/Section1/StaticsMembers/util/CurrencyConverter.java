package Section1.StaticsMembers.util;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static double dolarConverter(double dolarPrice, double quantity){
        double rawDolar = dolarPrice * quantity;
        double tax = rawDolar * IOF;
        return rawDolar + tax;

    }
}
