package _01estruturaSequencialExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02Retangulo {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double base;
		double altura;
		
		System.out.println("Digite a base do retângulo:");
		base = sc.nextDouble();
		System.out.println("Digite a altura do retângulo:");
		altura = sc.nextDouble();
		double area = base * altura ;
		double perimetro = 2*(base + altura);
		double diagonal = Math.sqrt(Math.pow(base, 2)+ (Math.pow(altura, 2)));
		System.out.println("A área total é de " +area+ "m");
		System.out.println("O perimetro é de: " +perimetro+ "m");
		System.out.println("A diagonal é de "+diagonal+"m");
		
	}

}
