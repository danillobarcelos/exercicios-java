package _04VetoresExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio12Comerciante {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, lucroBaixo, lucroMedio, lucroAlto;
		double compraTotal, vendaTotal, lucroTotal;
		
		System.out.print("Serão digitados dados de quantos produtos? ");
		n = sc.nextInt();
		
		String[] produto = new String[n];
		double[] precoCompra = new double[n];
		double[] precoVenda = new double[n];
		
		for(int i = 0; i < n ; i++) {
			System.out.println("PRODUTO "+(i + 1));
			System.out.print("NOME: ");
			produto[i] = sc.next();
			System.out.print("PREÇO DE COMPRA: ");
			precoCompra[i] = sc.nextDouble();
			System.out.print("PREÇO DE VENDA: ");
			precoVenda[i] = sc.nextDouble();
		}
		
		double[] lucro = new double[n];
		lucroBaixo = 0;
		lucroMedio = 0;
		lucroAlto = 0;
		for(int i = 0 ; i < n ; i++) {
			lucro[i] = ((precoVenda[i] - precoCompra[i])* 100)/precoCompra[i];
			if (lucro[i] < 10) {
				lucroBaixo++;
			} else if (lucro[i] <=10 || lucro[i] <= 20) {
					lucroMedio++;
				} else {
						lucroAlto++;
				}
		}
		
		compraTotal = 0;
		vendaTotal = 0; 
		for(int i = 0 ; i < n ; i++) {
			compraTotal = compraTotal + precoCompra[i];
			vendaTotal = vendaTotal + precoVenda[i];
		} 
		lucroTotal = (vendaTotal - compraTotal);
	
		System.out.println("\nRELATÓRIO:");
		System.out.println("Lucro abaixo de 10%: "+lucroBaixo);
		System.out.println("Lucro entre 10% e 20%: "+lucroMedio);
		System.out.println("Lucro acima de 20%: "+lucroAlto);
		System.out.println("Valor total de compra: "+compraTotal);
		System.out.println("Valor total de venda: "+vendaTotal);
		System.out.println("Lucro total: "+lucroTotal);
		
		
		sc.close();
	}
}
