import java.util.Scanner;

public class atvd2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int  n_alunos = 0, matricula = 0, ausentes = 0, maior5 = 0;
        double porc;
        String turma, situacao;

        for (int i = 1; i <  14; i++) {
            System.out.print("Informe a letra da turma " + i + ": ");
            turma = sc.next();
            System.out.print("Informe o numero de alunos da turma" + i + ": ");
            n_alunos = sc.nextInt();

            ausentes = 0;
            
            for (int t = 1; t < n_alunos; t++) {
                System.out.print("Informe a matrícula do aluno " + t + ": ");
                matricula = sc.nextInt();

                System.out.println("Para alunos AUSENTES  informe > A <");
                System.out.println("Para alunos PRESENTES informe > P <");
                System.out.print("Informe a situação do aluno: ");
                
                situacao = sc.next();

                if ((situacao == "a") || (situacao == "A")) {
                    ausentes++;
                }
            }

            porc = (ausentes / n_alunos) * 100;

            System.out.println(porc +  "% dos alunos estão ausentes na turma " + turma);

            if (porc > 5) {
                maior5++;
            }
        }

        System.out.println(maior5 + " turmas estão com mais de 5% dos seus alunos ausentes");
    }
}