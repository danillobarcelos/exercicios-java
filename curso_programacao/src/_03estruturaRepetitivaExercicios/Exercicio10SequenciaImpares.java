package _03estruturaRepetitivaExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio10SequenciaImpares {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite o valor de X: ");
		x = sc.nextInt();
		
		System.out.println("Valores impares: ");
		for (int i = 0; i <= x ; i++) {
			if (i%2 != 0) {
				System.out.println(i++);
			}
		} 
		
		
		
	}
}