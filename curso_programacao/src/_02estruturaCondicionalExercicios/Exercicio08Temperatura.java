package _02estruturaCondicionalExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio08Temperatura {
	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char escala;
		double tempC, tempF;
		
		System.out.println("Você vai digitar a temperatura em qual escala? (C/F)");
		escala = sc.nextLine().charAt(0);
		
		if (escala == 'F') {
			System.out.println("Digite a temperatura em Fahrenheit:");
			tempF = sc.nextDouble();
			tempC = (tempF - 32) * 5/9;
			System.out.println("A temperatura equivalente em Celsius é de " +String.format("%.2f", tempC));
			} else {
				System.out.println("Digite a temperatura em Celsius:");
				tempC = sc.nextDouble();
				tempF = (tempC * 9/5) + 32;
				System.out.println("A temperatura equivalente em Fahrenheit é de " +String.format("%.2f", tempF));
				}
	}
}