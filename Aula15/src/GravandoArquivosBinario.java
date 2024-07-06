import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class GravandoArquivosBinario {
	
	public static void main (String[] args) throws FileNotFoundException, IOException {
		
		Scanner teclado = new Scanner(System.in);
		String matricula;
		String nome;
		double teste, prova;
		int faltas;
		
		FileOutputStream arq = new FileOutputStream("C:\\Users\\Bruno\\Documents\\testebin.dat");
		DataOutputStream gravarArq = new DataOutputStream(arq);
		
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
		
		gravarArq.writeUTF(matricula);
		gravarArq.writeUTF(nome);
		gravarArq.writeDouble(teste);
		gravarArq.writeDouble(prova);
		gravarArq.writeInt(faltas);
		
		arq.close();
		
		System.out.println("Arquivo gravado com sucesso");
	
		

	}

}

