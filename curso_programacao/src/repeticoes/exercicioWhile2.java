package repeticoes;

import java.util.Scanner;

public class exercicioWhile2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x,y;
		
		System.out.println("Escreva coordenada X:");
		x = sc.nextInt();
		System.out.println("Escreva coordenada Y:");
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
				if(x > 0 && y > 0){
					System.out.println("primeiro");
					
				}else if(x < 0 && y > 0){
					System.out.println("segundo");
					
				}else if(x < 0 && y < 0){
					System.out.println("terceiro");
					
				}else{
					System.out.println("quarto");
				
				}
				x = sc.nextInt();
				y = sc.nextInt();
			
		}
		sc.close();

	}

}
