import java.util.Scanner;

public class Aula003 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double n1, n2, n3, n4, n5, media;
		
		System.out.println("Digite o valor da Nota 1: ");
		n1 = input.nextDouble();
		System.out.println("Digite o valor da Nota 2: ");
		n2 = input.nextDouble();
		System.out.println("Digite o valor da Nota 3: ");
		n3 = input.nextDouble();
		System.out.println("Digite o valor da Nota 4: ");
		n4 = input.nextDouble();
		System.out.println("Digite o valor da Nota 5: ");
		n5 = input.nextDouble();
		
		media = (n1 + n2 + n3 + n4 + n5)/5;
		
		System.out.println("Média do aluno é: " + media);
		
		if(media>=7) {
			System.out.println("Aprovado");			
					}
		else {
			if(media<4) {
				System.out.println("Reprovado");
						}
			else {
				System.out.println("Final");
			}
			}
			}
				
		
	

	}

