package _05MatrizesExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio05SomaMatrizes {
	public static void main(String[]args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int m, n;
	System.out.print("Digite quantas linhas terão cada matriz: ");
	m = sc.nextInt();
	System.out.print("Digite quantas colunas terão cada matriz: ");
	n = sc.nextInt();
	
	if(m > 10 || n > 10) {
		System.out.println("O NÚMERO MÁXIMO DE LINHAS E COLUNAS DEVE SER 10");
		System.out.print("Digite quantas linhas terão cada matriz: ");
		m = sc.nextInt();
		System.out.print("Digite quantas colunas terão cada matriz: ");
		n = sc.nextInt();
	}
	
	int[][] matrizA = new int[m][n];
	int[][] matrizB = new int[m][n];
	int[][] matrizC = new int[m][n];
	
	for(int i = 0; i < m ; i++) {
		for(int j = 0; j < n ; j++) {
			System.out.print("ELEMENTO ["+i+"]"+"["+j+"]: ");
			matrizA[i][j] = sc.nextInt();
		}
	}
	
	for(int i = 0; i < m ; i++) {
		for(int j = 0; j < n ; j++) {
			System.out.print("ELEMENTO ["+i+"]"+"["+j+"]: ");
			matrizB[i][j] = sc.nextInt();
		}
	}
	
	System.out.println("MATRIZ SOMA: ");
	for(int i = 0; i < m ; i++) {
		for(int j = 0; j < n ; j++) {
			matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
			System.out.println(matrizC[i][j]);
		}
	}

	
	
	sc.close();
	}
}
