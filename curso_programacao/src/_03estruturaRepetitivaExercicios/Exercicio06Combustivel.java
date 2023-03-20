package _03estruturaRepetitivaExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio06Combustivel {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		byte alcool, gasolina, diesel, codigo;
		
		System.out.println("Digite um código (1, 2, 3) ou 4 para parar:");
		codigo = sc.nextByte();
		
		alcool = 0;
		gasolina = 0;
		diesel = 0;
			
		while (codigo != 4) {
			if (codigo == 1) {
				alcool++;
			} else if ( codigo == 2) {
				gasolina++;
			} else if (codigo == 3){
				diesel++;
			}
			System.out.println("Digite um código (1, 2, 3) ou 4 para parar:");
			codigo = sc.nextByte();
		}
		
		
		System.out.println("MUITO OBRIGADO! \nÁlcool: "+alcool+"\nGasolina: "+gasolina+"\nDiesel: "+diesel);
	
		
		
		
		}	
}
