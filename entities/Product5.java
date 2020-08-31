package entities;

public class Product5 {
	public double valorDolar;
	public double totalReais;
	
	
	public double CurrencyConverter() {
		return valorDolar * totalReais * 1.06;
	}
}
