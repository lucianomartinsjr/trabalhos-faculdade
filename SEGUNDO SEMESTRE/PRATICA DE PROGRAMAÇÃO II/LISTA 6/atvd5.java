import java.util.Scanner;

public class atvd5 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int vet[] = { 82, 50, 71, 63, 85, 43, 39, 97, 14 };
    int i, j = 0;
    int aux;

    System.out.println("Vetor desordenado");
    for (j = 0; j < vet.length; j++) {
      System.out.print(" | " + vet[j]);
    }
    for (j = 1; j < vet.length; j++) {
      if (vet[j] < vet[j - 1]) {
        for (i = 0; i < j; i++) {
          if (vet[j] < vet[i]) {
            aux = vet[i];
            vet[i] = vet[j];
            vet[j] = aux;
          }
        }
      }
    }
    System.out.println(" ");

    System.out.println("Vetor ordenado");
    for (j = 0; j < vet.length; j++) {
      System.out.print(" | " + vet[j]);
    }
  }
}