package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double boughtDollars = sc.nextDouble();
		
		double reais = CurrencyConverter.converter(boughtDollars);
		
		System.out.printf("Price in reais: %.2f%n", reais);

		sc.close();

	}

}
