package _02estruturaCondicionalExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio07Dardo {
	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double jogada1, jogada2, jogada3;
		System.out.println("Digite a distância da primeira jogada:");
		jogada1 = sc.nextDouble();
		System.out.println("Digite a distância da segunda jogada");
		jogada2 = sc.nextDouble();
		System.out.println("Digite a distância da terceira jogada");
		jogada3 = sc.nextDouble();
		
		if (jogada1 > jogada2 && jogada1 > jogada3) {
			System.out.println("MAIOR DISTÂNCIA = "+jogada1);
			} else if (jogada2 > jogada1) {
				System.out.println("MAIOR DISTÂNCIA = "+jogada2);
				} else {
					System.out.println("MAIOR DISTÂNCIA = "+jogada3);
						}
		
		
	}
}