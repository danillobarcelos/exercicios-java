package _03estruturaRepetitivaExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio03SenhaFixa {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha; 
		System.out.println("Digite a sua senha: ");
		senha = sc.nextInt();
		
		while (senha != 2312) {
			System.out.println("Senha inválida! Digite novamente: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
	}
}
