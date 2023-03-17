package _01estruturaSequencialExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio05Troco {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	double precoUn;
	double quantComprada;
	System.out.println("Digite o preço do produto:");
	precoUn = sc.nextDouble();
	System.out.println("Digite a quantidade comprada:");
	quantComprada = sc.nextDouble();
	double valorCompra = precoUn * quantComprada;
	System.out.println("Qual o valor recebido em dinheiro?");
	double dinheiro = sc.nextDouble();
	double troco = dinheiro - valorCompra;
	System.out.println("TROCO = "+troco);
	
	}
}
