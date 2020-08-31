package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product1;

public class Program1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product1 product1 = new Product1();
		
		System.out.println("Enter rectangle width and height: ");
		product1.width = sc.nextDouble();
		product1.height = sc.nextDouble();
		
		System.out.println("Area = " + product1.area());
		System.out.println("Perimeter = " + product1.perimeter());
		System.out.println("Diagonal = " + product1.diagonal());
		
		sc.close();

	}

}
