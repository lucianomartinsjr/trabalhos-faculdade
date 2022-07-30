import java.util.Scanner;

public class atvd3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ano;

    do {
      System.out.print("Informe o ano para verificar se é bissexto: ");
      ano = sc.nextInt();

      if (ano <= 0) {
        System.out.println("Informado valor 0 ou menor que 0.\nFinalizando o algoritimo");
        break;
      } else {
        if (ano % 4 == 0)
          System.out.println("O ano informado e bissexto");
        else
          System.out.println("O ano informado nao e bissexto");
      }
    } while (ano > 0);
  }
}
