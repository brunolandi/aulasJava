import java.util.Scanner;

public class Aula004 {

	public static void main(String[] args) {
		
		double n1, n2, media, i;
			
						
		Scanner input = new Scanner(System.in);
		
		for(i=1;i<=5;i++) {
		
		System.out.println("Aluno 0" + (int)i);
		System.out.println("Digite a nota 1: ");
		n1 = input.nextDouble();
		System.out.println("Digite a nota 2: ");
		n2 = input.nextDouble();
		media = (n1+n2)/2;
		System.out.println("Media: " + media);
		System.out.println();
		}
		

	}

}
