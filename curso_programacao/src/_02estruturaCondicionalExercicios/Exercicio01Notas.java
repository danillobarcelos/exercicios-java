package _02estruturaCondicionalExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01Notas {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double nota1;
		double nota2;
		double notaMedia;
		
		System.out.println("Digite a sua primeira nota:");
		nota1 = sc.nextDouble();
		System.out.println("Digite a sua segunda nota:");
		nota2 = sc.nextDouble();
		notaMedia = (nota1 + nota2);
		
		if (notaMedia >= 60) {
			System.out.println("Nota final: " +String.format("%.1f", notaMedia));
		} else {
			System.out.println("Nota final: " +String.format("%.1f", notaMedia)+ "\nREPROVADO!");
		}
	}
}
