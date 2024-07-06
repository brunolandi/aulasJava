import java.util.Scanner;

public class Aula002 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int op;
		
		do {
			
			System.out.println("-------------------------------");
			System.out.println("|        Menu Princial        |");
			System.out.println("-------------------------------");
			System.out.println("Selecione uma das opções abaixo\n");
			System.out.println("1 - Aluno\n");
			System.out.println("2 - Professor\n");
			System.out.println("3 - Coordenador\n");
			System.out.println("0 - Sair\n");
			
			System.out.println("Qual opção deseja?");
			op = teclado.nextInt();
			
			if(op == 0)
				break;
			
			switch(op) {
			
			case 1:
				System.out.println("Você selecionou a opção de Aluno\n");
				break;
			case 2:
				System.out.println("Você selecionou a opção de Professor\n");
				break;
			case 3:
				System.out.println("Você selecionou a opção de Coordenador\n");
				break;
			default:
				System.out.println("Você selecionou uma opção inválida\n");
			}
			
		}while(true);
		
		System.out.println("Fim");
		
		
	}

}
