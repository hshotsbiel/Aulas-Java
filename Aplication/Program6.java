package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product6;

public class Program6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product6 product6;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Ist there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			product6 = new Product6(number, holder, initialDeposit);
		} else {
			product6 = new Product6(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(product6);		
		
		System.out.println();		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		product6.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(product6);
		
		System.out.println();		
		System.out.print("Enter a withdraw value: ");
		double withDrawValue = sc.nextDouble();
		product6.withDraw(withDrawValue);
		System.out.println("Updated account data: ");
		System.out.println(product6);
				
		sc.close();

	}
}
