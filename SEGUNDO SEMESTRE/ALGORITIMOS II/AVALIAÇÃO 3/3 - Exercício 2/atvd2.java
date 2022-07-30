import java.util.Scanner;

public class atvd2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k, n;

    System.out.print("Informe o valor de K: ");
    k = sc.nextInt();
    System.out.print("Informe o valor de N: ");
    n = sc.nextInt();

    System.out.println("Resultado da multiplicação: " + recebeInteiros(k, n));
    System.out.println("Foram executadas " + (n-1) + " multiplicacoes");
  }

  public static int recebeInteiros(int k, int n) {
    if (n == 1) {
      return k;
    }
    return k * recebeInteiros(k, n - 1);
  }
}