
public class Principal {

	public static void main(String[] args) {

		AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
		AlunoEnsinoSuperior alunoEnsinoSuperior = new AlunoEnsinoSuperior();
		
		alunoEnsinoMedio.nome = "Bruno";
		alunoEnsinoMedio.teste = 8;
		alunoEnsinoMedio.prova = 9;
		
		System.out.println("Aluno do Ensino Médio");
		System.out.println("NOME: " + alunoEnsinoMedio.nome);
		System.out.println("MÉDIA: " + alunoEnsinoMedio.getMedia());
		
		alunoEnsinoSuperior.nome = "Oswaldo";
		alunoEnsinoSuperior.teste = 8;
		alunoEnsinoSuperior.prova = 9;
		
		System.out.println("Aluno do Ensino Superior");
		System.out.println("NOME: " + alunoEnsinoSuperior.nome);
		System.out.println("MÉDIA: " + (float)alunoEnsinoSuperior.getMedia());
		
		
		
		

	}

}
