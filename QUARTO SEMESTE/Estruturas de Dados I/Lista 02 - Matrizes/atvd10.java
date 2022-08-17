import java.util.*;
public class atvd10 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[][] mtrz = new int[3][6];
        int[] vet = new int[18];

        System.out.println("\t\t\t- Vetor -");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = random.nextInt(100);
            System.out.printf(" %d",vet[i]);
        }

        int ContVet = 0;

        for (int i = 0; i < mtrz.length; i++) {
            for (int k = 0; k < mtrz[0].length; k++) {
                mtrz[i][k] = vet[ContVet];
                ContVet++;
            }
        }

        System.out.println("\n\t\t\t- Matriz -");
        for (int i = 0; i < mtrz.length; i++) {
            for (int k = 0; k < mtrz[0].length; k++) {
                System.out.printf("\t%d", mtrz[i][k]);
            }
            System.out.println("");
        }
    }
}
