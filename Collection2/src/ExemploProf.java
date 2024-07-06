import java.util.HashMap;
import java.util.Scanner;

public class ExemploProf {

	public static void main(String[] args) {

		Scanner entrada =  new Scanner(System.in);
		
		HashMap<Integer, String> linguagensProgramacao = new HashMap<>();
		linguagensProgramacao.put(1, "C++");
		linguagensProgramacao.put(2, "Java");
		linguagensProgramacao.put(3, "Cobol");
		System.out.println("Conteúdo HashMap: " + linguagensProgramacao);

		
		String valor = linguagensProgramacao.get(2);
		System.out.println("Elemento chave : " + valor);
		

	}

}
