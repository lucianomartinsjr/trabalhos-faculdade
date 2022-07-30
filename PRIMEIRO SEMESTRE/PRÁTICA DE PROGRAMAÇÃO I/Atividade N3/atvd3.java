import java.util.Scanner;
public class atvd3 {
    public static void main(String[] args){
        Scanner sc = new Scanner ( System.in );

        Double nota1,nota2,med,medgeral = 0.0 ;
        int cont;

        for (int i = 1; i <= 5; i++)
        {
            System.out.print("Informe a primeira nota do Aluno: ");
                nota1 = sc.nextDouble();
            System.out.print("Informe a primeira nota do Aluno: ");
                nota2 = sc.nextDouble();
            med = (nota1 + nota2)/2;
            medgeral = med + medgeral;
            System.out.print("A media desse aluno foi: "+med+"\n");

            cont = 5 - i;
            System.out.println("\n---Restam "+cont+" Alunos para informar as notas.---\n");
        }
        medgeral= medgeral / 5; 
        System.out.println("A media geral da sala foi: "+medgeral);
    }
}
