package _03estruturaRepetitivaExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio14Divisao {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, x, y;
		double resultado;
		
		System.out.print("Quantos casos você vai digitar? ");
		n = sc.nextInt();
		
		for ( int i = 0; i < n ; i++) {
			System.out.print("Entre com o numerador: ");
			x = sc.nextInt();
			System.out.print("Entre com o denominador: ");
			y = sc.nextInt();
			
			resultado = (double) x/y;
			
			if (y == 0) {
				System.out.println("DIVISÃO IMPOSSÍVEL ");
			} else {
				System.out.println("DIVISÃO = " +resultado);
			}
			
		}
		
		
		
	}
}
