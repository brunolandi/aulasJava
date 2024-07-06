import java.util.ArrayList;

import java.util.Scanner;

public class PensarEResponder {

  public static void main(String[] args) {

     

    ArrayList<Integer> numeros = new ArrayList<>();
    Scanner teclado = new Scanner(System.in);

    int soma = 0;
    
    while(true) {
      System.out.println("Digite um número inteiro (digite 0 para sair)): ");
      int num = teclado.nextInt();
      if(num == 0) {
        break;
      }

      numeros.add(num);
      soma += num;
    }

    System.out.println("Números armazenados: " + numeros);
    System.out.println("Soma de números armazenados: " + soma);

  }

}