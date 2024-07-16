package repeticoes;

import java.util.Scanner;

public class ExercicioNew4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de alunos: ");
		int n = sc.nextInt(); // inserir numero de alunos que serão usados no loop
		double valor = 0.0;
		int numAlunos = n;
		
		for (int i = n; i <= n; i--) {

			int x = 0;
			
			if (i > 0) {
				System.out.println("Nota do aluno: " + n);
				x = sc.nextInt();
				n = n - 1;
				valor = valor + x;
				
			}else if(i == 0) {
				double media = valor / numAlunos;
				System.out.println("Média da turma:" + media);
			}
			

		}

		sc.close();

	}

}
