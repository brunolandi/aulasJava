package exerciciosUdemy;

import java.util.Scanner;

public class exercicioEstrutura5 {

	public static void main(String[] args) {

		int itemCod;
		int quantidade;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código do item (1 a 5):");
		
		itemCod = sc.nextInt();
		if(itemCod == 1) {
			System.out.println("Item Cachorro Quente selecionado = Preço unid. R$ 4.00");
			System.out.println("Selecione a quantidade:");
			quantidade = sc.nextInt();
			double total = quantidade * 4.00;
			System.out.printf("Total a pagar = R$ %.2f", total);
			
		}else if(itemCod == 2) {
			System.out.println("Item X-Salada selecionado = Preço unid. R$ 4.50");
			System.out.println("Selecione a quantidade:");
			quantidade = sc.nextInt();
			double total = quantidade * 4.50;
			System.out.printf("Total a pagar = R$ %.2f", total);
			
		}else if(itemCod == 3) {
			System.out.println("Item X-Bacon selecionado = Preço unid. R$ 5.00");
			System.out.println("Selecione a quantidade:");
			quantidade = sc.nextInt();
			double total = quantidade * 5.00;
			System.out.printf("Total a pagar = R$ %.2f", total);
			
		}else if(itemCod == 4) {
			System.out.println("Item Torrada Simples selecionado = Preço unid. R$ 2.00");
			System.out.println("Selecione a quantidade:");
			quantidade = sc.nextInt();
			double total = quantidade * 2.00;
			System.out.printf("Total a pagar = R$ %.2f", total);
			
		}else if(itemCod == 5) {
			System.out.println("Item Refrigerante selecionado = Preço unid. R$ 1.50");
			System.out.println("Selecione a quantidade:");
			quantidade = sc.nextInt();
			double total = quantidade * 1.50;
			System.out.printf("Total a pagar = R$ %.2f", total);
			
		}else {
			System.out.println("Valor inserido inválido");
		}
		
		sc.close();

	}

}

