import java.util.Scanner;

public class EntradadeDeDados {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
				
		System.out.println("Digite algum valor STRING: ");
		x = sc.next();
		System.out.println("Valor registrado");
		
		System.out.println("Digite algum valor INT: ");
		y = sc.nextInt();
		System.out.println("Valor registrado");
		
		System.out.println("Digite algum valor DOUBLE: ");
		z = sc.nextDouble();
		System.out.println("Valor registrado");
		
		System.out.printf("Dados digitados: %n" + x + "\n" + y + "\n" + z);
		
		
		
		sc.close();

	}

}
