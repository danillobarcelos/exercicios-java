package _04VetoresExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio10Aprovados {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos alunos serão digitados?");
		n = sc.nextInt();
		
		String[] aluno = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];

		for(int i = 0 ; i < n ; i++) {
			System.out.println("Digite o nome, a primeira e a segunda nota do "+(i+1)+"a aluno");
			sc.nextLine();
			aluno[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();	
			
		}
		
		double[] soma = new double[n];
		double[] media = new double[n];
		for(int i = 0 ; i < n ; i++) {
			soma[i] = nota1[i] + nota2[i];
			media[i] = soma[i]/2;		
		}
		System.out.println("Alunos aprovados: ");
		for(int i = 0 ; i < n ; i++) {
			if (media[i] >= 6) {
				System.out.println(aluno[i]);
		
			}
		}
		sc.close();
	}
}
