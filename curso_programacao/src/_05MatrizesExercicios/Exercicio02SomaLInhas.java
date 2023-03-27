package _05MatrizesExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02SomaLInhas {
	public static void main(String[]args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	int n, m;
	System.out.print("Digite a quantidade de linhas da matriz: ");
	m = sc.nextInt();
	System.out.print("Digite a quantidade de colunas da matriz: ");
	n = sc.nextInt();
	
	double[][] matriz = new double[m][n];
	double[] vetor = new double[m];
	
	for(int i = 0 ; i < m ; i++) {
		System.out.println("Digite os elementos da "+(i+1)+"a linha: ");	
		for(int j = 0 ; j < n ; j++) {
			matriz[i][j] = sc.nextDouble();
		}
	}
	
	for(int i = 0; i < m ; i++) {
		
		int soma = 0;
		for(int j = 0 ; j < n ; j++) {
			soma += matriz[i][j];
		}
		vetor[i] = soma;
		
	}

	System.out.println("Vetor gerado: ");
	for(int i = 0; i < m ; i++) {
		System.out.println(vetor[i]);
	}
	
	sc.close();
	
	}
}
