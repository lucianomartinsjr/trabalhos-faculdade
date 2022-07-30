import java.util.Scanner;

public class atvd2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int vetor_total[] = new int[18];
    int aux = 0;
    int i = 0;
    int cont = 0, troca = 0, otimizado = 0;

    System.out.println("\n Escolha o vetor a ser ordenado (1,2,3)");
    aux = sc.nextInt();

    switch (aux) {
    case 1:
      int vet1[] = { 7, 13, 3, 4, 20, 5, 8, 9, 12, 10, 8, 7, 5, 2, 2, 3, 6, 1 };
      vetor_total = vet1;
      break;

    case 2:
      int vet2[] = { 20, 18, 14, 13, 12, 10, 9, 8, 7, 4, 3, 2, 1 };
      vetor_total = vet2;
      break;

    case 3:
      int vet3[] = { 1, 2, 3, 4, 7, 8, 9, 10, 12, 13, 15, 18, 20 };
      vetor_total = vet3;
    }
    System.out.println("Vetor desordenado");
    for (i = 0; i < vetor_total.length; i++) {
      System.out.print(" | " + vetor_total[i]);
    }

    for (i = 0; i < vetor_total.length - 1; i++) {
      if (vetor_total[i] > vetor_total[i + 1]) {
        otimizado++;
      }

      if (otimizado != 0) {
        for (i = 0; i < vetor_total.length; i++) {
          for (int j = 0; j < vetor_total.length - i - 1; j++) {
            if (vetor_total[j] > vetor_total[j + 1]) {
              aux = vetor_total[j];
              vetor_total[j] = vetor_total[j + 1];
              vetor_total[j + 1] = aux;
            }
            if (vetor_total[j] < vetor_total[i]) {
              troca++;
            }
            cont++;
          }
        }
      } else {
        System.out.println("vetor já ordenado !!!");
      }

      System.out.println("-----------------------");
      System.out.println("Vetor ordenado");
      for (i = 0; i < vetor_total.length; i++) {
        System.out.print(" | " + vetor_total[i]);
      }
      System.out.println(" ");
      System.out.println("Comparações no vetor = " + cont);
      System.out.println("Trocas no vetor =  " + troca);

    }
  }
}