package _03estruturaRepetitivaExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio11DentroFora {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, x, dentro, fora;
		
		System.out.println("Quantos números você irá digitar?");
		n = sc.nextInt();
		
		dentro = 0;
		fora = 0;

		for (int i = 0 ; i < n; i++) {
			System.out.print("Digite um número: " );
			x = sc.nextInt();
			

				if (x >= 10 && x < 20) {
					dentro++; 
				} else {
					fora++;
				}
		} 
		System.out.println(fora + " FORA\n" + dentro + " DENTRO");
		
		
		
	}
}
