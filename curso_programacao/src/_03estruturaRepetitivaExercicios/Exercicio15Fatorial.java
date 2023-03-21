package _03estruturaRepetitivaExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio15Fatorial {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, fatorial;
		
		System.out.println("Digite o valor de N: ");
		n = sc.nextInt();
		
		fatorial = 1;
		for (int i = n ; i > 0 ; i--) {
			fatorial = fatorial * i;			
		}
		System.out.println("FATORIAL = " +fatorial);
		
		
	}
}
