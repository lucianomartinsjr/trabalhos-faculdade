import java.util.Scanner;

public class atvd5 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int[][] mtrz = new int[3][6];
        int[] vet = new int[18];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe um valor para o vetor: ");
            vet[i] = sc.nextInt();
        }

        int ContVet = 0;

        for (int i = 0; i < mtrz.length; i++) {
            for (int k = 0; k < mtrz[0].length; k++) {
                mtrz[i][k] = vet[ContVet];
                ContVet++;
            }
        }

        for (int i = 0; i < mtrz.length; i++) {
            for (int k = 0; k < mtrz[0].length; k++) {
                System.out.printf("\t%d", mtrz[i][k]);
            }
            System.out.println("");
        }
    }
}
