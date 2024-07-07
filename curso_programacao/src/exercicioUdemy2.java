import java.util.Locale;
import java.util.Scanner;

public class exercicioUdemy2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		double largura, comprimento, metroQuadrado, area, preco;	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a Largura: ");
		largura = sc.nextDouble();
		System.out.println("Digite o Comprimento: ");
		comprimento = sc.nextDouble();
		System.out.println("Digite o valor do M²: ");
		metroQuadrado = sc.nextDouble();
		sc.close();
		
		area = largura * comprimento;
		preco = area * metroQuadrado;		
		
		System.out.printf("Area é igual: %.2f m²%n",area);
		System.out.printf("Preço é igual: R$ %.2f%n", preco);

	}

}
