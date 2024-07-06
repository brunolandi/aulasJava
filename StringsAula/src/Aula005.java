
public class Aula005 {

	public static void main(String[] args) {

		String nome = "Bruno";
		String sobreNome = "Landi";
		String blankSpace = " ";
		String nomeCompleto = nome + " " + sobreNome;
		String nomeComBuffer;
		
		
		//System.out.println(nome + " " + sobreNome);
		//System.out.println(nomeCompleto);
		
		StringBuilder buffer = new StringBuilder();
		
		buffer.append(nome);
		buffer.append(blankSpace);
		buffer.append(sobreNome);
		
		nomeComBuffer = buffer.toString();
		
		System.out.println(nomeCompleto);
		System.out.println(nomeComBuffer);
		
		
	}

}
