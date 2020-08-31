package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product3;

public class Program3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		Product3 product3 = new Product3();
		
		product3.name = sc.nextLine();
		product3.n1 = sc.nextDouble();
		product3.n2 = sc.nextDouble();
		product3.n3 = sc.nextDouble();
		
		System.out.println("Final grade = " + product3.finalGrade() );
		
		if(product3.finalGrade() > 60) {
			System.out.println("Pass");
		} else {
			System.out.println("Falied");
			System.out.printf("Missing %.2f points%n", product3.missingPoints());
		}
				
		sc.close();		

	}

}
