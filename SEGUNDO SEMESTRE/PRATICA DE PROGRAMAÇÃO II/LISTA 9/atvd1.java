
import java.util.Scanner;

public class atvd1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mtrz[][] = new int[10][3];
        int av1 = 0, av2 = 0, av3 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("- Informe as notas do aluno %d - ", (i + 1));
            System.out.println("");

            for (int j = 0; j < 3; j++) {
                System.out.printf("Informe nota da prova %d :", (j + 1));
                mtrz[i][j] = sc.nextInt();
                System.out.println("");
            }
        }

        System.out.println("");

        for (int i = 0; i < 10; i++) {
            System.out.printf("- Aluno %d : -", (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print(mtrz[i][j] + " | ");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int k = 0; k < 10; k++) {

            if ((mtrz[k][1] <= mtrz[k][2]) && (mtrz[k][1] <= mtrz[k][3])) {
                System.out.println((k + 1) + "º Aluno, menor nota  na prova 1: " + mtrz[k][1]);
                av1++;
            } else {
                if ((mtrz[k][2] <= mtrz[k][1]) && (mtrz[k][2] <= mtrz[k][3])) {
                    System.out.println((k + 1) + "º Aluno, menor nota na prova 2: " + mtrz[k][2]);
                    av2++;
                } else {
                    if ((mtrz[k][3] <= mtrz[k][1]) && (mtrz[k][3] <= mtrz[k][2])) {
                        System.out.println((k + 1) + "º Aluno, menor nota  na prova 3: " + mtrz[k][3]);
                        av3++;
                    }
                }
            }
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-");
        System.out.println("Notas baixas na primeira prova = " + av1);
        System.out.println("Notas baixas na segunda prova = " + av2);
        System.out.println("Notas baixas na teceira prova = " + av3);
    }
}