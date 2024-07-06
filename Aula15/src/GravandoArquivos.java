import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class GravandoArquivos {
	
	public static void main (String[] args) throws IOException {
		
		Scanner teclado = new Scanner(System.in);
		String matricula;
		String nome;
		double teste, prova;
		int faltas;
		
		FileWriter arq = new FileWriter("C:\\Users\\Bruno\\Documents\\teste.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		System.out.println("Digite sua matricula: ");
		matricula = teclado.next();
		
		System.out.println("Digite seu nome: ");
		nome = teclado.next();
		
		System.out.println("Digite seu teste: ");
		teste = teclado.nextDouble();
		
		System.out.println("Digite sua prova: ");
		prova = teclado.nextDouble();
		
		System.out.println("Quantidade de faltas: ");
		faltas = teclado.nextInt();
		
		gravarArq.println(matricula);
		gravarArq.println(nome);
		gravarArq.println(teste);
		gravarArq.println(prova);
		gravarArq.println(faltas);
		
		arq.close();
		
		System.out.println("Gravação efetuada com sucesso");
	
		

	}

}

