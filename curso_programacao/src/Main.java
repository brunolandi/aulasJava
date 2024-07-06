import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		int idade = 25;
		double altura = 1.68123123;
		char sexo = 'F';
		
		System.out.print("Olá Mundo!");
		System.out.println("Olá Mundo!");
		System.out.println(idade);
		System.out.printf("%.2f%n", altura);
		System.out.printf("%.4f%n", altura);
		System.out.println(altura);
		Locale.setDefault(Locale.US);
		
		System.out.println("RESULTADO = " + idade + " ANOS");
	}

}
