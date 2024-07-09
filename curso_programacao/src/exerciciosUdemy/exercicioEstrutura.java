package exerciciosUdemy;

import java.util.Scanner;

public class exercicioEstrutura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Bem vindo ao leitor de número negativos e positivos");
		System.out.println("Digite um número:");
		x = sc.nextInt();
		
		if(x >= 0) {
			System.out.println("NÃO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}

}
