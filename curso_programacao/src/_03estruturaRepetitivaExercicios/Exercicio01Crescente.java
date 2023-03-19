package _03estruturaRepetitivaExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01Crescente {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numX, numY;
		
		System.out.println("Digite dois números: ");
		numX = sc.nextInt();
		numY = sc.nextInt();
		
		while (numX != numY) {
			if (numX > numY) {
				System.out.println("CRESCENTE");
				} else {
				System.out.println("DECRESCENTE");
				}
			System.out.println("Digite outros dois números: ");
			numX = sc.nextInt();
			numY = sc.nextInt();
		} 			
	}
}		
