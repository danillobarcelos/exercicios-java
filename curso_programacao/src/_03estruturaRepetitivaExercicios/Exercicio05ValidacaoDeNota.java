package _03estruturaRepetitivaExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio05ValidacaoDeNota {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
			while (nota1 < 0 || nota1 >10) {
				System.out.println("Valor inválido! Tente novamente: ");
				nota1 = sc.nextDouble();
			}
		
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
				while (nota2 < 0 || nota2 > 10) {
				System.out.println("Valor inválido! Tente novamente: ");
				nota2 = sc.nextDouble();
			}
		
		media = (nota1 + nota2)/2;
		System.out.println("Média = " +media);
		
		
		
	}
}
