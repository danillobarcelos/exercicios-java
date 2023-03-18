package _02estruturaCondicionalExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio11Aumento {
	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, novoSalario, aumento;
		int porcentagem;
		System.out.println("Digite o valor do salário: ");
		salario = sc.nextDouble();
		
		if (salario <= 1000) {
			porcentagem = 20;
			novoSalario = salario + (salario * porcentagem) / 100;
			System.out.println("Novo salário = R$" +novoSalario);
			} else if (salario > 1000 && salario <=3000){
				porcentagem = 15;
				novoSalario = salario + (salario * porcentagem) / 100;
				System.out.println("Novo salário = R$" +novoSalario);
				} else if (salario > 3000 && salario <= 8000) {
					porcentagem = 10;
					novoSalario = salario + (salario * porcentagem) / 100;
					System.out.println("Novo salário = R$" +novoSalario);
					} else {
						porcentagem = 55;
						novoSalario = salario + (salario * porcentagem) / 100;
						System.out.println("Novo salário = R$" +novoSalario);
					}
		aumento = (novoSalario - salario);
		System.out.println("Aumento = R$" +aumento);
		System.out.println("Porcentagem " +porcentagem+"%");
		
		
	}
}
