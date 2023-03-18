package _02estruturaCondicionalExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio13Coordenadas {
	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String quadrante;
		double valorX, valorY;
		
		System.out.println("Digite o valor de X: ");
		valorX = sc.nextDouble();
		System.out.println("Digite o valor de Y: ");
		valorY = sc.nextDouble();
		
		if (valorX > 0 && valorY > 0) {
			quadrante = "Q1";
			System.out.println("Quadrante = " +quadrante);
			} else if (valorX < 0 && valorY > 0) {
				quadrante = "Q2";
				System.out.println("Quadrante = " +quadrante);
				} else if (valorX < 0 && valorY < 0) {
					quadrante = "Q3";
					System.out.println("Quadrante = " +quadrante);
					} else if (valorX > 0 && valorY < 0){
						quadrante = "Q4";
						System.out.println("Quadrante = " +quadrante);
						} else if (valorX == 0 && valorY != 0) {
							System.out.println("Eixo Y");
							} else if (valorY == 0 && valorX != 0) {
								System.out.println("Eixo X");
								} else {
									System.out.println("Origem");
								}
		
				
		
}
}
