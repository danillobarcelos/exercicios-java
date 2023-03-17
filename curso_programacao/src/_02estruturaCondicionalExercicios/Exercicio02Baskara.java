package _02estruturaCondicionalExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02Baskara {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
	double a, b, c, x1, x2, delta;
	
	System.out.println("Digite o coeficiente A:");
	a = sc.nextDouble();
	System.out.println("Digite o coeficiente B:");
	b = sc.nextDouble();
	System.out.println("Digite o coeficiente C:");
	c = sc.nextDouble();
	delta = Math.pow(b, 2)- 4*a*c;
	
	if (delta < 0 ) {
		System.out.println("Está equação não possuí raizes reais");
		} else {
			x1 = ((-b) + Math.sqrt(delta))/(2*a);
			x2 = ((-b) - Math.sqrt(delta))/(2*a);
			System.out.println("X1 = " +String.format("%.4f", x1));
			System.out.println("X2 = " +String.format("%.4f", x2));
		}
	}

}
