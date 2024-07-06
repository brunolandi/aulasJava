
public class Aula001 {

	public static void main(String[] args) {

		String nome = "Bruno";
		String nomeWar = "Bruno";
		String sobrenome = new String("Bruno");

		//usando if == para analisar o conteudo, o if aqui compara a locação do valor declarado  
		if (nome == nomeWar)
			System.out.println("Nomes Iguais");
		else
			System.out.println("Nomes Diferents");
		if (nome == sobrenome)
			System.out.println("Nomes Iguais");
		else
			System.out.println("Nomes Diferents");
	}

}
