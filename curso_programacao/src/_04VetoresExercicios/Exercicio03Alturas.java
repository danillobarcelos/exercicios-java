package _04VetoresExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio03Alturas {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, pessoaMenor;
		double alturaTotal, alturaMedia, menoresPorcentagem;
		
		System.out.println("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double [n];
		
		for (int i = 0; i<n ; i++) {
			System.out.println("Dados da "+(i+1)+"a pessoa:");
			System.out.print("	Nome: ");
			nome[i] = sc.next();
			System.out.print("	Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("	Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		pessoaMenor = 0;
		alturaTotal = 0;
		for (int i = 0 ; i < n ; i++) {
			if (idade[i]<16) {
				pessoaMenor++;
			}
			alturaTotal = alturaTotal + altura[i];
		}
		
		alturaMedia = alturaTotal/n;
		menoresPorcentagem = ((double)pessoaMenor/n)*100;
		
		System.out.println("Altura média = " +String.format("%.2f", alturaMedia));
		System.out.println("Pessoas com menos de 16 anos: " +menoresPorcentagem+"%");
		
		for(int i = 0; i < n ; i++) {
			if (idade[i] < 16) {
				System.out.print("\n" + nome[i]);
			}
		}
		
		
		
		
		
		
	}
}
