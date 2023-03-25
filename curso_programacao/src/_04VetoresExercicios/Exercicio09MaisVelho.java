package _04VetoresExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio09MaisVelho {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantas pessoas você irá digitar?");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int [n];
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Dados da "+(i+1)+"a pessoa");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		int maisVelho = idade[0];
		String pessoaVelha = nome[0];
		for(int i = 1; i < n; i++) {
			if (idade[i] > maisVelho) {
				maisVelho = idade[i];
				idade[i] = idade[0];
				
				pessoaVelha = nome[i];
				nome[i] = nome[0];
			}
		}
		System.out.println("PESSOA MAIS VELHA: "+pessoaVelha);
		
		
		
		sc.close();
	}
}
