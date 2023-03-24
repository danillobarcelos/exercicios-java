package _04VetoresExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio05MaiorPosicao {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos números você irá digitar?");
		n = sc.nextInt();
		
		int[] num = new int[n];
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Digite um número: ");
			num[i] = sc.nextInt();
		}
		
		int maior = num[0];
		int maiorPos = 0;
		
		for(int i = 1 ; i < n ; i++) {
			if (num[i] > maior) {
				maior = num[i];
				maiorPos = i;
			}
		}
		
		System.out.println("Maior valor: " +maior);
		System.out.println("Posição do maior valor: "+maiorPos);
	}
}
