import java.util.Locale;
import java.util.Scanner;

public class exercicioUdemy4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double area, raio;
		
		System.out.println("Bem vindo ao calculador de raio");
		System.out.println("Digite o valor do raio do círculo");
		raio = sc.nextDouble();
		
		area = pi * (raio*raio);
		sc.close();
		
		System.out.println("Valor do raio digitado: " + raio);
		System.out.printf("O valor da área desse raio é %.4f%n", area);

	}

}
