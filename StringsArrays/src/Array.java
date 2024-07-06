import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		double v1, v2, v3, media;
		
		Scanner vnota = new Scanner(System.in);
		
		System.out.println("Insira valor 1: ");
		v1 = vnota.nextDouble();
		System.out.println("Insira valor 2: ");
		v2 = vnota.nextDouble();
		System.out.println("Insira valor 3: ");
		v3 = vnota.nextDouble();
		
		media = (v1+v2+v3)/3;
		
		System.out.println("Media do aluno é:" + (float)media);

	}

}
