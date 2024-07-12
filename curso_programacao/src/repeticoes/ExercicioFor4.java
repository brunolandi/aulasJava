package repeticoes;

import java.util.Scanner;

public class ExercicioFor4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int valor;
		String op;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite valor a ser analisado: ");
			valor = sc.nextInt();
			if (valor >= 10 && valor <= 20) {
				op = "in";
			} else {
				op = "out";
			}
			System.out.println(i + 1 + " " + op);
		}

		sc.close();
	}

}