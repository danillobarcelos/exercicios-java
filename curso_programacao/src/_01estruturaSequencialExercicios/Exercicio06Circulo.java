package _01estruturaSequencialExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio06Circulo {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	double raio;
	System.out.println("Digite o valor do raio do circulo: ");
	raio = sc.nextDouble();
	double area = Math.PI * Math.pow(raio, 2);
	System.out.println("AREA = " +String.format("%.3f",area));
	}
}
