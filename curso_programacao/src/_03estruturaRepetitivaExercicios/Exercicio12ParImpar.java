package _03estruturaRepetitivaExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio12ParImpar {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, x;
		
		System.out.println("Quantos números você irá digitar?");
		n = sc.nextInt();
		
		for ( int i = 0 ; i < n ; i++) {
			System.out.print("Digite um número: ");
			x = sc.nextInt();
			
			if (x > 0 && x%2 == 0) {
				System.out.println("POSITIVO PAR");
			} else if (x > 0 && x%2 != 0) {
				System.out.println("POSITIVO IMPAR");
			} else if (x < 0 && x%2 == 0) {
				System.out.println("NEGATIVO PAR");
			} else if (x < 0 && x%2 != 0) {
				System.out.println("NEGATIVO IMPAR");
			} else {
				System.out.println("NULO");
			}
		}
		
		
		
		
		
	}
}
