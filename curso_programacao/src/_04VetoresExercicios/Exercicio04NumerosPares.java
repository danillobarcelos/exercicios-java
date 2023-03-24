package _04VetoresExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio04NumerosPares {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos números você vai digitar");
		n = sc.nextInt();
		
		int[] numero = new int[n];		
		for (int i = 0; i < n ; i++) {
			System.out.print("Digite um número: ");
			numero[i] = sc.nextInt();
		}
		
		int contador = 0;
		System.out.print("Números pares: \n");
		for(int i = 0; i<n; i++) {
			if (numero[i]%2 == 0) {
				contador++;
				
				System.out.print(numero[i] + " ");
			} 
		}
		System.out.println("\nQuantidade de pares: " +contador);

		
		
	}
}
