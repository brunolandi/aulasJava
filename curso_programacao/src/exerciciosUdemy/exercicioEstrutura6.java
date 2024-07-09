package exerciciosUdemy;

import java.util.Locale;
import java.util.Scanner;

public class exercicioEstrutura6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double entrada;
		
		System.out.println("Digite um número para analisar o intervalo:");
		entrada = sc.nextDouble();
		
		if(entrada >= 0.00 && entrada <= 25.00) {
			System.out.println("Intervalo [0 , 25]");
		}else if(entrada >= 25.01 && entrada <= 50.00) {
			System.out.println("Intervalo [25 , 50]");
		}else if(entrada >= 50.01 && entrada <= 75.00) {
			System.out.println("Intervalo [50 , 75]");
		}else if(entrada >= 75.01 && entrada <= 100.00) {
			System.out.println("Intervalo [75 , 100]");
		}else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();

	}

}
