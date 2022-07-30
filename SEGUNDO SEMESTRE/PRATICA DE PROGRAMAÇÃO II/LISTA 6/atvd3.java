import java.util.Scanner;

public class atvd3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int vetor_total[] = new int[20];
    int i = 0, j, chave, min, escolha, aux;
    int comparacoes = 0, trocas = 0;

    System.out.printf("\n Escolha o vetor a ser ordenado (1,2,3) ");
    escolha = sc.nextInt();

    switch (escolha) {
    case 1:
      int vetor1[] = { 7, 13, 3, 4, 20, 5, 8, 9, 12, 10, 8, 7, 5, 2, 2, 3, 6, 1 };
      vetor_total = vetor1;
      break;
    case 2:
      int vetor2[] = { 20, 18, 14, 13, 12, 10, 9, 8, 7, 4, 3, 2, 1 };
      vetor_total = vetor2;
      break;
    case 3:
      int vetor3[] = { 1, 2, 3, 4, 7, 8, 9, 10, 12, 13, 15, 18, 20 };
      vetor_total = vetor3;
      break;
    }

    for (i = 0; i < vetor_total.length - 1; i++) {
      min = i;
      for (j = i + 1; j < vetor_total.length; j++) {
        if (vetor_total[j] < vetor_total[min]) {
          min = j;
        }
      }
      aux = vetor_total[min];
      vetor_total[min] = vetor_total[i];
      vetor_total[i] = aux;
    }

    System.out.println("Vetor ordenado = ");

    for (i = 0; i < vetor_total.length; i++) {
      System.out.print(" | " + vetor_total[i]);
    }

    System.out.println(" ");
    System.out.println("Comparações no vetor = " + comparacoes);
    System.out.println("Trocas no vetor =  " + trocas);

  }
}
