package exerciciosUdemy;

import java.util.Scanner;

public class exercicioSwitchCase {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int x;
		String dia;
		
		System.out.println("Digite o dia da semana: ");
		x = sc.nextInt();
		
		switch(x){
			case 1:
				dia = "Domingo";
				break;
			case 2:
				dia = "Segunda";
				break;
			case 3:
				dia = "Terça";
				break;
			case 4:
				dia = "Quarta";
				break;
			case 5:
				dia = "Quinta";
				break;
			case 6:
				dia = "Sexta";
				break;
			case 7:
				dia = "Sábado";
				break;
			default:
				dia = "Dia inválido";
		}
		
		/*
		if(x == 1) {
			dia = "Domingo";
		}else if(x == 2){
			dia = "Segunda";
		}else if(x == 3){
			dia = "Terça";
		}else if(x == 4){
			dia = "Quarta";
		}else if(x == 5){
			dia = "Quinta";
		}else if(x == 6){
			dia = "Sexta";
		}else if(x == 7){
			dia = "Sábado";
		}else {
			dia = "Dia inválido";
		}
		*/
		System.out.println("Dia da semana: " + dia);
		
	}

}
