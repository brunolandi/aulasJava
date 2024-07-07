import java.util.Scanner;

public class exercicioUdemy5 {

	public static void main(String[] args) {

		int A,B,C,D, DIFF;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		A = sc.nextInt();
		System.out.println("Digite um número");
		B = sc.nextInt();
		System.out.println("Digite um número");
		C = sc.nextInt();
		System.out.println("Digite um número");
		D = sc.nextInt();
		
		DIFF = (A * B) - (C * D);
		sc.close();
		
		System.out.printf("Valores digitados: %d, %d, %d, %d%n", A, B, C, D);
		System.out.println("DIFERENÇA: " + DIFF);

	}

}

