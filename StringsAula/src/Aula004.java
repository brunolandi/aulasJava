
public class Aula004 {

	public static void main(String[] args) {

		String nome = "Bruno";
		String sobreNome = "Landi";
		String blankSpace = " ";
		String nomeCompleto = nome + " " + sobreNome;
		String nomeComBuffer;
		
		
		//System.out.println(nome + " " + sobreNome);
		//System.out.println(nomeCompleto);
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(nome);
		buffer.append(blankSpace);
		buffer.append(sobreNome);
		
		nomeComBuffer = buffer.toString();
		
		System.out.println(nomeCompleto);
		System.out.println(nomeComBuffer);
	}

}
