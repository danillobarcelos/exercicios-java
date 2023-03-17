package exemplos_aula;
import java.util.Locale;
import java.util.Scanner;

public class entrada_saida_dados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade1, idade2;
		double altura1, altura2;
		String nome1, nome2;
		char sexo1, sexo2;
		
		System.out.print("Nome da primeira pessoa: ");
		nome1 = sc.nextLine();
		System.out.print("Idade da primeira pessoa:");
		idade1 = sc.nextInt();
		System.out.print("Altura da primeira pessoa: ");
		altura1 = sc.nextDouble();
		System.out.print("Sexo da primeira pessoa (F/M): ");
		sexo1 = sc.next().charAt(0);
		sc.nextLine();
		
		System.out.print("Nome da segunda pessoa: ");
		nome2 = sc.nextLine();
		System.out.print("Idade da segunda pessoa:");
		idade2 = sc.nextInt();
		System.out.print("Altura da segunda pessoa: ");
		altura2 = sc.nextDouble();
		System.out.print("Sexo da segunda pessoa (F/M): ");
		sexo2 = sc.next().charAt(0);
		
		System.out.println("De acordo com os dados inseridos, temos os seguintes valores "
				+ "para as variáveis: ");
		
		System.out.println("Nome1 =" +nome1);
		System.out.println("Nome2 =" +nome2);
		System.out.println("Idade1 =" +idade1);
		System.out.println("Idade2 =" +idade2);
		System.out.println("Altura1 =" +String.format("%.2f", altura1));
		System.out.println("Altura2 =" +String.format("%.2f", altura2));
		System.out.println("Sexo1 =" +sexo1);
		System.out.println("Sexo2 =" +sexo2);
		sc.close();

	}

}
