package exerciciosUdemy;
import java.util.Locale;
import java.util.Scanner;

public class exercicioUdemy7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codPeca1, numPeca1, codPeca2, numPeca2;
		double valorPeca1, valorPeca2, toPay;
		
		System.out.println("Digite o código da peça 1:");
		codPeca1 = sc.nextInt();
		System.out.println("Digite a quantidade da peça nº1:");
		numPeca1 = sc.nextInt();
		System.out.println("Digite o valor da peça 1:");
		valorPeca1 = sc.nextDouble();
		System.out.println("Digite o código da peça 2:");
		codPeca2 = sc.nextInt();
		System.out.println("Digite a quantidade da peça nº2:");
		numPeca2 = sc.nextInt();
		System.out.println("Digite o valor da peça 2:");
		valorPeca2 = sc.nextDouble();
		
		toPay = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);
		sc.close();
		
		System.out.printf("Valores digitados = cód1: %d qtd1: %d valor1: %.2f%n", codPeca1, numPeca1, valorPeca1);
		System.out.printf("Valores digitados = cód2: %d qtd2: %d valor2: %.2f%n", codPeca2, numPeca2, valorPeca2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", toPay);
		

	}

}
