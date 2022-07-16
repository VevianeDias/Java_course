package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantos nomes vais digitar? ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			int age = sc.nextInt();
			double high = sc.nextDouble();
			vect[i] = new Product(name, age, high);
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getHigh();
		}

		int nmenores = 0;
		for (int i = 0; i < n; i++) {
			if (vect[i].getAge() < 16) {
				nmenores++;
			}

			double percentualMenores = ((double) nmenores / n) * 100.0;

			double avg = sum / vect.length;

			System.out.printf("High average: %.2f%n", avg);
			System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

			
			 for(i=0; i<n; i++) {
			        if (vect[i].getAge() < 16) {
			        	System.out.printf("%s\n", vect[i].getName());
			        }
			    }
			
			
			sc.close();
		}
	}
}
