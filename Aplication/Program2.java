package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product2 product2 = new Product2();
		
		System.out.print("Name: ");
		product2.name = sc.nextLine();
		System.out.print("Gross salary: ");
		product2.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		product2.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + product2);
		
		System.out.print("Which percentage to increase salary? ");		
		double percentage = sc.nextDouble();
		product2.increaseSalary(percentage);	
		System.out.println();
		System.out.println("Updated data: " + product2);
		
		sc.close();

	}

}
