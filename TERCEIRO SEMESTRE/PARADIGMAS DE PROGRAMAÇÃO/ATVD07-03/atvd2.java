import java.util.Scanner;

public class atvd2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int fat = 0, num;

    do {
      System.out.print("Informe um valor: ");
      num = sc.nextInt();
      if (num < 0 || num > 10)
        break;
      else {
        fat = 1;
        for (int i = 1; i <= num; i++) {
          fat *= i;
        }
      }

    } while (num < 0 || num > 10);

    System.out.println("O fatorial do numero é :" + fat);

  }

}
