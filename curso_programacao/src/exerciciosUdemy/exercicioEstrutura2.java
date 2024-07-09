package exerciciosUdemy;

import java.util.Scanner;

public class exercicioEstrutura2 {

	public static void main(String[] args) {

		int N;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE UM NUMERO");
		N = sc.nextInt();
		
		if(N % 2 == 0) {
			System.out.println(N % 2);
			System.out.println("PAR");
		}else {
			System.out.println(N % 2);
			System.out.println("IMPAR");
			
		}

		sc.close();
	}

}
