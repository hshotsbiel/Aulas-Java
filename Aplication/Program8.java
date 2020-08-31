package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product8;

public class Program8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product8[] vect = new Product8[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product8(name, price);
		}
		
		double sum = 0.0;
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
				
		System.out.printf("Average price = %.2f%n", avg);
		
		sc.close();
	}
}
