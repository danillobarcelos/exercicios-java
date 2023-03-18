package _02estruturaCondicionalExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio09Lanchonete {
	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		byte produto;
		int quantidade; 
		double preco, precoTotal;
		
		System.out.println("Digite o código do produto comprado: ");
		produto = sc.nextByte();
		System.out.println("Digite a quantidade comprada: ");
		quantidade = sc.nextInt();
		
		switch (produto) {
			case 1:
				preco = 5.00;
				precoTotal = quantidade * preco;
				System.out.println("Valor a pagar: R$" +String.format("%.2f", precoTotal));
				break;
			case 2:
				preco = 3.50;
				precoTotal = quantidade * preco;
				System.out.println("Valor a pagar: R$" +String.format("%.2f", precoTotal));
				break;
			case 3:
				preco = 4.80;
				precoTotal = quantidade * preco;
				System.out.println("Valor a pagar: R$" +String.format("%.2f", precoTotal));
				break;
			case 4:
				preco = 8.90;
				precoTotal = quantidade * preco;
				System.out.println("Valor a pagar: R$" +String.format("%.2f", precoTotal));
				break;
			case 5:
				preco = 7.32;
				precoTotal = quantidade * preco;
				System.out.println("Valor a pagar: R$" +String.format("%.2f", precoTotal));
				break;
	
		}
		
		
	}
}
