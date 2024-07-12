import java.util.Scanner;

public class EntradadeDeDados {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = 10, b, x;
		
		
		String nome = "Jordan";
		
		System.out.println("Digite o valor de A");
		a = sc.nextInt();
		System.out.println("Digite o valor de B");
		b = sc.nextInt();
		
		
		x = a * b;
		
		
		/*
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
		*/
		System.out.println("Bruno");
		System.out.println(x);
		
		
		sc.close();

	}

}
