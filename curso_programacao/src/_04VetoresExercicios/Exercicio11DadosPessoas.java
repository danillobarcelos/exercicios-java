package _04VetoresExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio11DadosPessoas {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double mediaMulheres;
	
		System.out.println("Quantas pessoas serão digitadas?");
		n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i = 0; i < n ; i++) {
			System.out.print("Altura da "+(i+1)+"a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Gênero da "+(i+1)+"a pessoa: ");
			genero[i] = sc.next().charAt(0);
			System.out.println();
		}
		
		double menorAltura = altura[0];
		double maiorAltura = altura[0];
		for(int i = 0; i < n; i++) {
			if (menorAltura > altura[i]) {
				menorAltura = altura[i];
				altura[i] = altura[0];
			}
			if (maiorAltura < altura[i]) {
				maiorAltura = altura[i];
				altura[i] = altura[0];
			}
		}
		
		int numHomens = 0;
		double numMulheres = 0;
		double alturaMulheres = 0;
		for(int i = 0; i < n; i++) {
			if (genero[i] == 'F' || genero[i] == 'f') {
				numMulheres++;
				alturaMulheres = alturaMulheres + altura[i];
			} 
			if (genero[i] == 'M' || genero[i] == 'm'){
				numHomens++;
			}
		}
		mediaMulheres = alturaMulheres / numMulheres;
		
		System.out.print("Menor altura: ");
		System.out.println(menorAltura);
		System.out.print("Maior altura: ");
		System.out.println(maiorAltura);
		System.out.print("Média altura das mulheres:  ");
		System.out.println(String.format("%.2f", mediaMulheres));
		System.out.print("Número de homens:  ");
		System.out.println(numHomens);
		
		sc.close();
	}
}
