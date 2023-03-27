package _05MatrizesExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01DiagonalNegativos {
	public static void main(String[]args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int n; 
	System.out.println("Qual a ordem da matriz?");
	n = sc.nextInt();
	
	int[][] numero = new int[n][n];
	
	for(int i = 0 ; i < n ; i++) {
		for(int j = 0; j < n ; j++) {
			System.out.print("Elemento ["+i+"], ["+j+"]: ");
			numero[i][j] = sc.nextInt();
			
		}
	}
	
	System.out.println("Diagonal principal: ");
	for(int i = 0 ; i < n ; i++) {
		System.out.println(numero[i][i]);
	}
	
	int soma = 0;
	System.out.println("Quantidade de números negativos: ");
	for(int i = 0 ; i < n ; i++) {
		for(int j = 0; j < n ; j++) {
			if (numero[i][j] < 0) {
				soma++;
			}
		}
	}
	System.out.println(soma);
		
		sc.close();
	}
}
