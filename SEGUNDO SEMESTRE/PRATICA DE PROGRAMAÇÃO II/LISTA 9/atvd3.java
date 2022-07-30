import java.util.Scanner;
public class atvd3 {
    public static void main(String[] args) {
        int[][] mtrz = new int[15][5];
        int[] Repetentes = new int[mtrz.length * mtrz[0].length];
        int RepetentesCont = 0;
        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < mtrz.length; i++) {
            for (int k = 0; k < mtrz[0].length; k++) {
                System.out.printf("Informe um número para a posição [%d, %d]: ", i, k);
                mtrz[i][k] = sc.nextInt();
            }
        }

        for (int i = 0; i < mtrz.length; i++) {
            for (int k = 0; k < mtrz[0].length; k++) {
                int contador = 0;
                Boolean Informado = false;

                for (int c = 0; c < Repetentes.length; c++) {
                    if (mtrz[i][k] == Repetentes[c]) {
                        Informado = true;
                        break;
                    }
                }

                if (!Informado) {
                    for (int a = 0; a < mtrz.length; a++) {
                        for (int b = 0; b < mtrz[0].length; b++) {
                            if (mtrz[i][k] == mtrz[a][b]) {
                                contador++;
                                Repetentes[RepetentesCont] = mtrz[i][k];
                            }   
                        }
                    }
                }

                if (contador > 1 && !Informado) {
                    System.out.printf("O número %d se repetiu %d vezes.\n", mtrz[i][k], contador);
                }

                RepetentesCont++;
            }
        }
    }
}
