import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        // Declaração de variáveis
        int num1, num2;
        double quociente, potencia;

        // Criação de um objeto Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro número
        System.out.print("Digite o primeiro número inteiro: ");
        num1 = scanner.nextInt();

        // Solicita ao usuário que insira o segundo número
        System.out.print("Digite o segundo número inteiro: ");
        num2 = scanner.nextInt();

        // Calcula o quociente da divisão dos dois números
        quociente = (double) num1 / num2;

        // Calcula a potência do primeiro número pelo segundo número
        potencia = Math.pow(num1, num2);

        // Exibe os resultados
        System.out.println("Quociente da divisão: " + quociente);
        System.out.println("Potência: " + potencia);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}