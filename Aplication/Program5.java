package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product5;

public class Program5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product5 product5 = new Product5();
		
		System.out.print("Whats is the dollar price? ");
		product5.valorDolar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		product5.totalReais = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + product5.CurrencyConverter());
		
		
		
		sc.close();

	}

}
