package _02estruturaCondicionalExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio12TempoDeJogo {
	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hInicial, hFinal, duracao;
		System.out.println("Hora inicial do jogo: ");
		hInicial = sc.nextInt();
		System.out.println("Hora final do jogo: ");
		hFinal = sc.nextInt();
		
		if (hInicial > hFinal) {
			duracao = (24 - hInicial) + hFinal;
			} else if (hInicial == hFinal) {
				duracao = 24;
				} else {
					duracao = hFinal - hInicial;
					}
		System.out.println("O jogo durou " +duracao+ " hora(s)");
		
	}
}
