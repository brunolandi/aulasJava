package exerciciosUdemy;

import java.util.Scanner;

public class exercicioEstrutura3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A,B,C;
		
		System.out.println("DIGITE O PRIMEIRO VALOR:");
		A = sc.nextInt();
		System.out.println("DIGITE O SEGUNDO VALOR:");
		B = sc.nextInt();
		
		if(A >= B) {
			C =  A % B;
			System.out.println("SÃO MULTIPLOS");
			
		}else if(A < B) {
			C = B % A;
			System.out.println("NÃO SÃO MULTIPLOS");
		}
		
	
		sc.close();

	}

}
