import java.util.Scanner;

public class exercicioUdemy6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numFunc, horaTrab;
		double valorHora, salary;

		System.out.println("Bem vindo ao cálculador de salário");
		System.out.println("Digite o número de funcionário:");
		numFunc = sc.nextInt();
		System.out.println("Digite as horas trabalhadas:");
		horaTrab = sc.nextInt();
		System.out.println("Digite o valor que recebe por hora:");
		valorHora = sc.nextDouble();
				
		salary = valorHora * horaTrab;
	
		sc.close();
		
		System.out.println("Número do funcionário = " + numFunc);
		System.out.printf("Salário = R$ %.2f%n", salary);

	}

}
