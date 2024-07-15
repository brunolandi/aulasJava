package repeticoes;

import java.util.Scanner;

public class ExercicioNew {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos patinhos foram passear?");
		int n = sc.nextInt();

		for (int i = n; i <= n; i--) {
			if (i > 0) {
				System.out.printf("%d patinhos foram passear%n", i);
				System.out.printf("mas só %d patinhos voltaram de lá%n", i - 1);
				System.out.println();
			} else if (i == 0) {
				System.out.println("a mamãe patinha foi procurar");
				System.out.printf("e os %d patinhos voltaram de lá%n", n);
			} else {

			}

		}

		sc.close();
	}

}
