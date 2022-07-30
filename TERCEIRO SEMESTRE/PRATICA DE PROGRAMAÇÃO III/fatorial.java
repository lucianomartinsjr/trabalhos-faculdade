import java.util.Scanner;

public class Fatorial {
  public static void main(String args[]) {
    final Scanner sc = new Scanner(System.in);
    int numero, fat;
    System.out.print("\nPor favor informe um numero: ");
    numero = sc.nextInt();
    fat = CalcularFatorial(numero);
    System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    System.out.printf("\nO fatorial do numero %d : ->  %d  <-\n", numero, fat);
  }

  public static int CalcularFatorial(int numero) {
    if (numero == 0 || numero == 1) {
      return 1;
    } else {
      return numero * CalcularFatorial(numero - 1);
    }
  }
}