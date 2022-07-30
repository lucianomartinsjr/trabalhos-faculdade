
import java.util.Scanner;

public class atvd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mtrz = new int[4][7];
        int minmax = 0, linha = 0, col = 0, menor = 9999999;

        for (int i = 0; i < mtrz.length; i++) {
            for (int k = 0; k < mtrz[0].length; k++) {
                System.out.printf("Informe o valor para %d | %d: ", i, k);
                mtrz[i][k] = sc.nextInt();
            }
        }

        System.out.println(" ");

        for (int i = 0; i < mtrz.length; i++) {
            for (int k = 0; k < mtrz[0].length; k++) {
                if (mtrz[i][k] < menor) {
                    menor = mtrz[i][k];
                    linha = i;
                    col = k;
                    minmax = mtrz[i][k];
                }
            }
        }

        for (int i = 0; i < mtrz[0].length; i++) {
            if (mtrz[linha][i] > minmax) {
                minmax = mtrz[linha][i];
                col = i;
            }
        }

        for (linha = 0; linha < mtrz.length; linha++) {
            for (col = 0; col < mtrz[0].length; col++) {
                System.out.printf("| %.2d |", mtrz[linha][col]);
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        System.out.printf("O elemento minmax da matriz é %d e se encontra na linha %d.", minmax, linha);
    }
}
