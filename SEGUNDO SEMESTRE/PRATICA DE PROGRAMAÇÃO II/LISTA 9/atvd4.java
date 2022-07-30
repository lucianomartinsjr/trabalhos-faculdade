
import java.util.Scanner;

public class atvd4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mtrz[][] = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println("Digite um valor para a linha " + i + " e a coluna " + j + ": ");
                mtrz[i][j] = sc.nextInt();
            }
        }

        System.out.println("");

        Boolean ver = true;

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (mtrz[i][j] != mtrz[j][i]) {
                    ver = false;
                }
            }
        }

        System.out.println("");

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                System.out.print(mtrz[i][j]);
            }
            System.out.println("");
        }

        System.out.println("");

        if (ver == true) {
            System.out.println("A matriz e simetrica");
        } else {
            System.out.println("A matriz nao e simetrica :c");
        }

    }
}
