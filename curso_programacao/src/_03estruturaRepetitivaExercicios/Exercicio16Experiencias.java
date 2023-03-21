package _03estruturaRepetitivaExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio16Experiencias {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, nCobaia, total;
		double porcentagemS, porcentagemR, porcentagemC;
		char tipoCobaia;

		System.out.print("Quantos casos de testes serão digitados? ");
		n = sc.nextInt();
		int quantC = 0, quantR = 0, quantS = 0;
		
		for (int i = 0 ; i < n ; i ++) {
			System.out.print("Quantidade de cobaias: ");
			nCobaia = sc.nextInt();
			System.out.print("Tipo de cobaia (C, R, S): ");
			tipoCobaia = sc.next().charAt(0);


			if (tipoCobaia == 'C') {
				quantC = quantC + nCobaia;
			} else if (tipoCobaia == 'R') {
				quantR = quantR + nCobaia;
			} else if (tipoCobaia == 'S') {
				quantS = quantS + nCobaia;
				
			}	
		} 		
		
		total = quantC + quantR + quantS;
		System.out.println("\nRELATÓRIO FINAL");
		System.out.println("TOTAL = "+total+ " cobaias");
		System.out.println("TOTAL DE COELHOS = "+quantC);
		System.out.println("TOTAL DE RATOS = "+quantR);
		System.out.println("TOTAL DE SAPOS= "+quantS);
		porcentagemC = ((double) quantC/total) * 100;
		porcentagemR = ((double) quantR/total) * 100;
		porcentagemS = ((double) quantS/total) * 100;
		
		System.out.println("PERCENTUAL DE COELHOS = " +String.format("%.2f", porcentagemC));
		System.out.println("PERCENTUAL DE RATOS = " +String.format("%.2f", porcentagemR));
		System.out.println("PERCENTUAL DE SAPOS = " +String.format("%.2f", porcentagemS));
	
	

	}
}
