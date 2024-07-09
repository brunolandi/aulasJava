package exerciciosUdemy;

import java.util.Locale;
import java.util.Scanner;

public class exercicioEstrutura9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int minutos;
		double conta = 50.0;
		
		System.out.println("Digite quantidade de minutos usados:");
		minutos = sc.nextInt();
		
		if(minutos <= 100) {
			
		}else {
			conta += (minutos - 100)*2;
								
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", conta);

		sc.close();
	}

}
