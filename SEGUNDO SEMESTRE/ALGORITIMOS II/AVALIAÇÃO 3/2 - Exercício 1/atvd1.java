import java.util.Scanner;

public class atvd1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] vet = new int[10];

    for (int i = 0; i < 10; i++) {
      vet[i] = sc.nextInt();
    }
    System.out.println("Indice: " + recebeVetor(vet));
  }

  public static int recebeVetor(int[] vet) {
    for (int i = 0; i < vet.length; i++) {
      for (int j = 0; j < vet.length - 1; j++) {
        if (vet[j] == 1) {
          return i;
        }
      }
    }
    return -1;
  }
}