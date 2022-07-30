import java.util.Scanner;

public class atvd1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double valor, valorReajuste;

    System.out.print("Informe o valor: ");
    valor = sc.nextDouble();

    if (valor <= 3000) {
      valorReajuste = (valor * 0.35);
      valor = valor + valorReajuste;

      System.out.println("- O Aumento será de 35% -\n");
    } else if (valor <= 5000 && valor >= 3001) {
      valorReajuste = (valor * 0.20);
      valor = valor + valorReajuste;

      System.out.println("- O Aumento será de 20% -\n");
    } else {
      valorReajuste = (valor * 0.05);
      valor = valor + valorReajuste;

      System.out.println("- O Aumento será de 5% -\n");
    }

    System.out.printf("\nO valor do reajuste foi : %.2f", valorReajuste);
    System.out.printf("\nO Totalizando: %.2f", valor);

  }
}