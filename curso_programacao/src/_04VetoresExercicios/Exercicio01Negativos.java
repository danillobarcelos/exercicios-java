package _04VetoresExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01Negativos {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n; 
		System.out.println("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		int[] num = new int [n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("\nNÚMEROS NEGATIVOS");		
		
		for (int i = 0 ; i <n ; i++) {
			if (num[i] < 0) {
				System.out.println(num[i]);
			}
		}
		
		
		
		
		
		
		
	}
}
