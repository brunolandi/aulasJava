import java.util.Scanner;

public class UsandoString {

	public static void main(String[] args) {

		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Aluno " + nome);

	}

}
