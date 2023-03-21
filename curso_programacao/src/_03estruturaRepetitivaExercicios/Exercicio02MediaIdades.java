package _03estruturaRepetitivaExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02MediaIdades {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade;
		int contador = 0;
		double media;
		double soma = 0;
		
		System.out.println("Digite as idades: ");
		idade = sc.nextInt();

		if (idade <= 0) {
			
				System.out.println("Impossível calcular"); 
		} else {
				contador = 0; 
			} while (idade >= 0) {
				soma = idade + soma; 
				contador++;
				idade = sc.nextInt();
			}
			media = soma / contador;
			System.out.println("MÉDIA = " +media);
	} 
}

				