package _02estruturaCondicionalExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio10Multiplos {
	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextInt();
		
		if (num1%num2 == 0 || num2%num1 == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não são multiplos");
			}
	}

}
