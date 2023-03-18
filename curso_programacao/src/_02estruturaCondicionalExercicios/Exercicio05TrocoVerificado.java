package _02estruturaCondicionalExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio05TrocoVerificado {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoProduto;
		int unCompradas;
		double valorTotal;
		double valorPag;
		double troco;
		double falta;
		
		System.out.println("Preço unitário do produto: ");
		precoProduto = sc.nextDouble();
		System.out.println("Quantidade comprada: ");
		unCompradas = sc.nextInt();
		valorTotal = (precoProduto * unCompradas);
		System.out.println("Dinheiro recebido para o pagamento: ");
		valorPag = sc.nextDouble();
		if (valorPag > valorTotal) {
			troco = (valorPag - valorTotal);
			System.out.println("Troco: "+String.format("%.2f", troco));
		} else {
			falta = (valorTotal - valorPag);
			System.out.println("DINHEIRO INSUFICIENTE! FALTAM " +String.format("%.2f", falta)+ " REAIS");
		}
		
		
	}
}
