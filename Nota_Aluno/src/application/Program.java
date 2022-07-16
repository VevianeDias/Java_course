package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student std = new Student();

		std.name = sc.nextLine();
		std.grade1 = sc.nextDouble();
		std.grade2 = sc.nextDouble();
		std.grade3 = sc.nextDouble();

		System.out.printf("Final grade: %.2f%n", std.finalGrade());

		if (std.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f points%n", std.missingPoints());
		} else {
			System.out.println("PASS");
		}

		sc.close();

	}

}
