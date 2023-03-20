package _03estruturaRepetitivaExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio04Quadrante {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		do {
			System.out.println("Digite os valores das coordenadas X e Y: ");
			x = sc.nextDouble();
			y = sc.nextDouble();
			 
				if (x > 0 && y > 0) {
				System.out.println("Quadrante Q1");
				} else if (x < 0 && y > 0) {
				System.out.println("Quadrante Q2");				
				} else if ( x < 0 && y < 0) {
				System.out.println("Quadrante Q3");
				} else if (x > 0 && y <0){
				System.out.println("Quadrante Q4");
				} 
			} while ( x != 0 && y != 0);
		
	}
	}

