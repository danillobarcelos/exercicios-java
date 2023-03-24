package _04VetoresExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio07AbaixoDaMedia {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos elementos terão o seu vetor? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0; 
		for(int i = 0 ; i < n ; i++) {
			soma = vetor[i] + soma;
		}
		
		double media = soma/n;
		System.out.println("Média = "+String.format("%.3f", media));
		
		System.out.println("Elementos abaixo da média: ");
		for(int i = 0; i < n ; i++) {
			if (vetor[i] < media) {
				System.out.println(String.format("%.1f", vetor[i]));
			}
		}
		
	}
}
