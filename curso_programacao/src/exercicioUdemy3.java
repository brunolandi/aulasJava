import java.util.Scanner;

public class exercicioUdemy3 {

	public static void main(String[] args) {

		int valor1,valor2,resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo ao programa de soma!");
		System.out.println("Digite o primeiro valor:");
		valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		valor2 = sc.nextInt();
		
		resultado = valor1 + valor2;
		sc.close();
		
		System.out.println("SOMA = " + resultado);

	}

}
