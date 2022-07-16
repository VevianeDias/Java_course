package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Qts num vc vai digitar?");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		double sum = 0.0;
		for(int i=0; i<vect.length; i++) {
			sum += vect[i];
		}
		
		double avg = sum/vect.length;
		
		System.out.printf("valores: ");


	    for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f  ", vect[i]);
	    }
	    
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
		
	
	  
	  
		sc.close();
	}


}
