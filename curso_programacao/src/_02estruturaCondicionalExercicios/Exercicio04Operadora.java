package _02estruturaCondicionalExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio04Operadora {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double valorPlano = 50.00;
		int minutos;
		int minExtra;
		
		System.out.println("Digite a quantidade de minutos:");
		minutos = sc.nextInt();
		if (minutos < 100) {
			System.out.println("Valor a pagar = "+valorPlano);
		} else {
			minExtra = (minutos - 100);
			valorPlano += (minExtra * 2);
			System.out.println("Valor a pagar = "+valorPlano);
			}
		
		
	}

}
