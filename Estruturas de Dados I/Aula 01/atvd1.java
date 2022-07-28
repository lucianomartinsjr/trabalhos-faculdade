import java.util.Scanner;

public class atvd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int [10];

        for (int i = 0; i < 10; i++){
            System.out.print("Informe o número da posição "+(i+1)+" =");
            vetor[i] = sc.nextInt();
        }

        int soma = 0;
        for(int i = 0; i < 10; i++){
            soma = soma + vetor[i];
        }

        System.out.println("A soma da matriz e :" + soma);
    }
}