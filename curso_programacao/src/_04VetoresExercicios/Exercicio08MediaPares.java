package _04VetoresExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio08MediaPares {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos elementos terá o seu vetor? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		int soma = 0;
		int contador = 0;
		for(int i = 0 ; i < n ; i++) {
			if (vetor[i]%2 ==0) {
				soma = soma + vetor[i];
				contador++;
			}
		}
		
		if (contador == 0 ) {
			System.out.println("NENHUM NÚMERO PAR");
		} else {
			double media = (double) soma/contador;
			System.out.print("MÉDIA DOS NÚMEROS PARES: ");
			System.out.print(media);
		}
		
		
	}
}
