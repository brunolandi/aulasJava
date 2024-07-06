import java.util.Scanner;

public class MainWithTry {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int dividendo = scanner.nextInt();
		int divisor = scanner.nextInt();
		
		try {
			int quociente = dividendo / divisor;
			System.out.println("Resultado = " + quociente);	
		}catch(Exception e){
			System.out.println("Causa: " + e.getCause());
			System.out.println("Causa: " + e.getMessage());
			System.out.println("Causa: " + e.getClass());
			System.out.println("Ops! Não é possível obter o resultado!");
		}
		
		
	}

}
