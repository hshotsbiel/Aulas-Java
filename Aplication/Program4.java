package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product4;

public class Program4 {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Product4.cirncumference(radius);
		
		double v = Product4.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Product4.PI);
		
		
		sc.close();

	}
	
	

}
