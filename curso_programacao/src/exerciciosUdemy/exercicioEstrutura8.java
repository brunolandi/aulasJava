package exerciciosUdemy;

import java.util.Locale;
import java.util.Scanner;

public class exercicioEstrutura8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario;
		
		System.out.println("Digite o seu salário para calcular imposto");
		salario = sc.nextDouble();
		
		if (salario > 0.00 && salario <= 2000.00) {	
			System.out.println("Isento");
			
		}else if(salario > 2000.01 && salario < 3000.00) {
			double calcImposto = ((salario - 2000.00)/100)*8;
			System.out.printf("Imposto a pagar: R$ %.2f", calcImposto);
			
		}else if(salario >= 3000.01 && salario <= 4500.00) {
			double oldImposto = 80.00; //R$80 = max imposto entre 2000 e 3000
			double calcImposto = ((salario - 3000.00)/100)*18;
			double imposto = oldImposto + calcImposto;	
			System.out.printf("Imposto a pagar: R$ %.2f", imposto);
			
		}else if(salario >= 4500.01) {
			double oldImposto = 80.00 + 270.00; //R$80 = max imposto entre 2000 e 3000 --- R$270 = max imposto entre 3000 e 4500.
			double calcImposto = ((salario - 4500.00)/100)*28;
			double imposto = calcImposto + oldImposto;
			
			System.out.printf("Imposto a pagar: R$ %.2f", imposto);
		}

		sc.close();
	}

}
