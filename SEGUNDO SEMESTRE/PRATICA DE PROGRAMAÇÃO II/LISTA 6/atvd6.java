import java.util.Scanner;

public class atvd6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int ftotal[] = new int[8];
    final int k = 3;
    int i, j, h = 1, value, aux;
    int trocas = 0, comparacoes = 0;

    System.out.println("\n Escolha o vetor a ser ordenado ( 1 , 2 , 3 , 4) ");
    aux = sc.nextInt();

    switch (aux) {
    case 1:
      int f1[] = { 45, 56, 12, 43, 95, 19, 8, 67 };
      ftotal = f1;
      break;

    case 2:
      int f2[] = { 8, 12, 19, 43, 45, 56, 67, 95 };
      ftotal = f2;
      break;

    case 3:
      int f3[] = { 95, 67, 56, 45, 43, 19, 12, 8 };
      ftotal = f3;
      break;

    case 4:
      int f4[] = { 19, 12, 8, 45, 43, 56, 67, 95 };
      ftotal = f4;
    }

    System.out.println("Vetor desordenado");
    for (i = 0; i < ftotal.length; i++) {
      System.out.print(" | " + ftotal[i]);
    }

    do {
      h = k * h + 1;
    } while (h < ftotal.length);

    do {
      h = h / k;
      for (i = h; i < ftotal.length; i++) {
        value = ftotal[i];
        j = i - h;
        comparacoes++;
        while (j >= 0 && value < ftotal[j]) {
          ftotal[j + h] = ftotal[j];
          j = j - h;
          trocas++;
        }
        ftotal[j + h] = value;
      }
    } while (h != 1);
    System.out.println(" ");
    System.out.println("-------------------------------------");
    System.out.println("Vetor ordenado");
    for (int c = 0; c < ftotal.length; c++) {
      System.out.print(" | " + ftotal[c]);
    }

    System.out.println(" ");
    System.out.println("Comparações no vetor = " + comparacoes);
    System.out.println("Trocas no vetor =  " + trocas);

  }
}