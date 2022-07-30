import java.util.Scanner;
public class atvd4 {
    public static void main(String[] args){
        Scanner sc = new Scanner ( System.in );

        Double nota1,nota2,med,medgeral = 0.0 ;
        int cont;

        for (int i = 1; i <= 5; i++)
        {
            System.out.print("\nInforme a primeira nota do Aluno: ");
                nota1 = sc.nextDouble();
            System.out.print("Informe a primeira nota do Aluno: ");
                nota2 = sc.nextDouble();

            med = (nota1 + nota2)/2;
            medgeral = med + medgeral;

            System.out.print("A media desse aluno foi: "+med+"\n");
                if(med >= 6.0 )
                    System.out.println("\n--- Aluno com media maior que 6.0 : APROVADO! c: --- ");
                else
                    System.out.println("\n--- Aluno com media menor que 6.0 : REPROVADO :c --- ");

            cont = 5 - i;
            System.out.print("\n__________________________________________________");
            System.out.print("\n\nRestam "+cont+" Alunos para informar as notas.");
            System.out.println("\n__________________________________________________");
        }
        medgeral= medgeral / 5; 
        System.out.println("A media geral da sala foi: "+medgeral);
    }
}
