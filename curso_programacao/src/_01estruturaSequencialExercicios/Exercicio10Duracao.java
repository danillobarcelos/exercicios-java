package _01estruturaSequencialExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio10Duracao {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int duracao;
		System.out.println("Digite a duração em segundos: ");
		duracao = sc.nextInt();
		double horas = duracao / 3600;
		double resto = duracao % 3600;
		double minutos = resto / 60;
		double segundos = resto % 60;

		
		System.out.println((int)horas +" : "+ (int)minutos + " : " + (int)segundos);
	}

}
