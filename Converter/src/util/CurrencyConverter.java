package util;

public class CurrencyConverter {

	public static final double dollarPrice = 3.10;
	
	public static double converter(double boughtDollars) {
		return (boughtDollars*dollarPrice) + (boughtDollars*dollarPrice*0.06); 
	}
}
