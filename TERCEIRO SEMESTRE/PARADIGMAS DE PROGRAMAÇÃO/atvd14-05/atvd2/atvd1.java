import java.util.Scanner;

public class atvd1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float a = 1, b = 1;

    while (a != 0 || b != 0) {
      try {
        System.out.printf("Informe dois numeros: \n");
        a = sc.nextFloat();
        b = sc.nextFloat();

        realizarDivisao(a, b);
      } catch (ArithmeticException e) {
        System.out.println("Houve erro aritmetico.");
      } catch (Exception t) {
        System.out.printf("\nErro.");
      } finally {
        System.out.printf("\nFinalizado.");
      }

    }
  }

  public static void realizarDivisao(float a, float b) {
    System.out.printf("Resultado: %f", a / b);
  }

}
