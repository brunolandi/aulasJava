
public class Aula002 {

	public static void main(String[] args) {

		String nome = "Bruno";
		String nomeWar = "Bruno";
		String sobrenome = new String("Bruno");

		
		//trocando == por .equals aqui o equals compara exclusivamente o conteudo, possivelmente utilizada para comparar senhas/email
		if (nome.equals(nomeWar))
			System.out.println("Nomes Iguais");
		else
			System.out.println("Nomes Diferents");
		if (nome.equals(sobrenome))
			System.out.println("Nomes Iguais");
		else
			System.out.println("Nomes Diferents");
	}

}
