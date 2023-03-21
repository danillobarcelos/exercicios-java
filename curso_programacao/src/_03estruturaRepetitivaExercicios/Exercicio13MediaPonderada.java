package _03estruturaRepetitivaExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio13MediaPonderada {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int n;
		double x, y, z, media;
		
		System.out.print("Quantos casos você vai digitar? ");
		n = sc.nextInt();
		
		for (int i = 0 ; i < n ; i++) {
		
			System.out.println("Digite os três números: ");
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			media = ((2 * x) + (3 * y) + (5 * z)) / 10;
			System.out.print("MÉDIA = "+String.format("%.1f", media)+"\n");
		
		}
		
		
		
		
	}
}
