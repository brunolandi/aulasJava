import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int dividendo = scanner.nextInt();
		int divisor = scanner.nextInt();
		double quociente = (double)dividendo / (double)divisor;
		
		System.out.println("Resultado = " + quociente);
		
	}

}
