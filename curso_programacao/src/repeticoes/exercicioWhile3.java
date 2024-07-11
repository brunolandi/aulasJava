package repeticoes;

import java.util.Scanner;

public class exercicioWhile3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		int alcool = 0, gasolina = 0, diesel = 0;
		
		while(op != 4) {
				if(op == 1) {
					alcool = alcool + 1;
				}else if(op == 2){
					gasolina = gasolina + 1;
				}else if(op == 3){
					diesel = diesel + 1;
				}
				
				op = sc.nextInt();
		}
		
		System.out.println("Muito obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
		
	}

}
