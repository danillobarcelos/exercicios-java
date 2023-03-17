package _01estruturaSequencialExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01Terreno {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double largura;
		double comprimento;
		double valorMetroQ;
		
		System.out.println("Digite a largura do terreno:");
		largura = sc.nextDouble();
		System.out.println("Digite o comprimento do terreno:");
		comprimento = sc.nextDouble();
		System.out.println("Digite o valor do m² do terreno:");
		valorMetroQ = sc.nextDouble();
		double areaT = largura * comprimento;
		double precoT = areaT * valorMetroQ;
		System.out.println("A área do terreno é de "+areaT);
		System.out.println("O preço do terreno é de R$"+precoT);
		
	}

}
