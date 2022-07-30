import java.util.Scanner;

public class atvd1 {
  public static void main(String args[]) {

    int vetor[] = { 19, 8, 2, 20, 35, 74, 1, 102, 3, 95, 6 };
    int aux = 0;
    int i = 0;

    System.out.println("Vetor desordenado: ");
    for (i = 0; i < vetor.length; i++) {

      System.out.print(" " + vetor[i]);
    }

    for (i = 1; i < vetor.length; i++) {
      for (int j = vetor.length - 1; j >= 1; j--) {
        if (vetor[j] < vetor[j - 1]) {
          aux = vetor[j];
          vetor[j] = vetor[j - 1];
          vetor[j - 1] = aux;

          System.out.println("");
          for (int ij = 0; ij < vetor.length; ij++) {
            System.out.print(" " + vetor[ij]);
          }
        }
      }
    }

    System.out.println("");
    System.out.println("Vetor Ordenado: ");
    for (i = 0; i < vetor.length; i++) {
      System.out.print(" " + vetor[i]);
    }

  }
}
