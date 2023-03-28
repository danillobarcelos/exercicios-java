package _05MatrizesExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio04CadaLinha {
	public static void main(String[]args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int n, maior; 
	System.out.print("Qual a ordem da matriz? ");
	n = sc.nextInt();
	
	int[][] matriz = new int[n][n];
	int[] vetorMaior = new int[n];
	
	for(int i = 0; i < n; i++) {
		for(int j = 0; j < n; j++) {
			System.out.print("ELEMENTO["+i+"]"+"["+j+"]: ");
			matriz[i][j] = sc.nextInt();
		}
	}
	
	
	
	for(int i = 0; i < n ; i++) {
		maior = matriz[i][0];
		for(int j = 0 ; j < n ; j++) {
			if (matriz[i][j] > maior) {
				maior = matriz[i][j];
			}
		}
		vetorMaior[i] = maior;
	}
	
	System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
	for(int i = 0; i < n ; i++) {
		System.out.println(vetorMaior[i]);
	}
	
	
	sc.close();
	}
}
