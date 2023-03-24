package _04VetoresExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio06SomaVetores {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos valores terão cada um dos vetores? ");
		n = sc.nextInt();
		
		int[] vetorA = new int[n];
		int[] vetorB = new int [n];		
		int[] vetorC = new int [n];
		
		System.out.println("Digite os valores para o vetor A: ");
		for(int i = 0 ; i < n ; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores para o vetor B: ");
		for(int i = 0 ; i < n ; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for(int i = 0 ; i < n ; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}

		
		
	}
}
