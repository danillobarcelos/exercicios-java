package _05MatrizesExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio06AcimaDiagonal {
	public static void main(String[]args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int n, soma;
	
	System.out.print("Qual a ordem da matriz? ");
	n = sc.nextInt();
	
	if(n >10) {
		System.out.println("ORDEM MÁXIMA DA MATRIZ É DE 10!");
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
	}
	
	int[][] matriz = new int[n][n];
	
	for(int i = 0; i < n; i++) {
		for(int j = 0 ; j < n ; j++) {
			System.out.print("ELEMENTO ["+i+"]"+"["+j+"]: ");
			matriz[i][j] = sc.nextInt();
		}
	}
	
	soma = 0;
	for(int i = 0; i < n ; i++) {
		for(int j = 0; j < n ; j++) {
			if (i < j) {
				soma += matriz[i][j];
			}
		}
	}
	System.out.print("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL: ");
	System.out.print(soma);
	sc.close();
	}
}
