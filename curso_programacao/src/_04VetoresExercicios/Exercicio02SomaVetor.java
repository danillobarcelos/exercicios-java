package _04VetoresExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02SomaVetor {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos números você irá digitar?");
		n = sc.nextInt();
		
		double[] numero = new double [n];
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Digite um número: ");
			numero[i] = sc.nextInt();
		}
		
		System.out.print("VALORES:");
		for(int i = 0 ; i < n ; i++) {
			System.out.print(" " +numero[i]);
		}
		
		System.out.print("\nSOMA:");
		double soma = 0;
		for(int i = 0 ; i < n ; i++) {
			soma = soma + numero[i];
		}
		System.out.print(" " +soma);
		
		double media = soma / n;
		System.out.println("\nMÉDIA: " +media);
			
		}
		
	}

