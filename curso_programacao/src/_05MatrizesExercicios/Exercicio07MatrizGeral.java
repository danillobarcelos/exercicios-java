package _05MatrizesExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio07MatrizGeral {
	public static void main(String[]args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int n, soma, linha, coluna;
	
	System.out.print("Digite a ordem da matriz: ");
	n = sc.nextInt();
	
	if(n > 10) {
		System.out.println("ORDEM MÁXIMA DA MATRIZ É DE 10!");
		System.out.print("Digite a ordem da matriz: ");
		n = sc.nextInt();
	}
	
	int[][] matriz = new int [n][n];
	
	for(int i = 0; i < n ; i++) {
		for(int j = 0; j < n ; j++) {
			System.out.print("ELEMENTO ["+i+"]"+"["+j+"]: ");
			matriz[i][j] = sc.nextInt();
		}
	}
	// a) calcular e imprimir a soma de todos os elementos positivos da matriz.
	soma = 0;
	for(int i = 0; i < n ; i++) {
		for(int j = 0; j < n ; j++) {
			if (matriz[i][j] > 0) {
				soma += matriz[i][j];
			}
		}
	}
	System.out.print("SOMA DOS ELEMENTOS POSITIVOS DA MATRIZ: "+soma);
	
	// b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.
	System.out.println("\nESCOLHA UMA LINHA: ");
	linha = sc.nextInt();
	
	while (linha >= n) { 
		System.out.println("DIGITE UMA LINHA VALIDA!");
		System.out.print("ESCOLHA UMA LINHA: ");
		linha = sc.nextInt();
	}
	
	System.out.println("LINHA ESCOLHIDA: ");
	for(int j = 0; j < n ; j++) {
		System.out.print(matriz[linha][j]+" ");
		}

	//c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.
	
	System.out.println("\nESCOLHA UMA COLUNA: ");
	coluna = sc.nextInt();
	
	while (coluna >=n) {
		System.out.println("DIGITE UMA COLUNA VALIDA!");
		System.out.print("ESCOLHA UMA COLUNA: ");
		coluna = sc.nextInt();
	}
	
	System.out.print("COLUNA ESCOLHIDA: ");
	for(int i = 0 ; i < n ; i++) {
		System.out.print(matriz[i][coluna]+" ");
	}
	
	//d) imprimir os elementos da diagonal principal da matriz.
	System.out.print("\nDIAGONAL PRINCIPAL: ");
	for(int i = 0; i < n ; i++) {
		for(int j = 0; j < n ; j++) {
			if (i == j) {
				System.out.print(matriz[i][j]+" ");
			}
		}
	}
	
	// e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir 
	// a matriz alterada.
	
	System.out.println("\nMATRIZ ALTERADA: ");
	for(int i = 0 ; i < n ; i++) {
		for(int j = 0 ; j < n ; j++) {
			if (matriz[i][j] < 0) {
				matriz[i][j] *= matriz[i][j];
			} 
			System.out.println(matriz[i][j]);
		}
	}
	
	sc.close();
	}
}
