import java.util.Scanner;

public class atvd4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nmr, n, rest;
        int inicio = 0, meio;

        System.out.print("Digite a quantidade de elementos do vetor: ");
        n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.printf("Informe o valor %d do vetor: ", i);
            vet[i] = sc.nextInt();
        }

        System.out.print("Informe o valor que deseja buscar: ");
        nmr = sc.nextInt();

        int fim = vet.length - 1;

        while (inicio <= fim) {
            meio = (fim + inicio) / 2;

            if (vet[meio] == nmr) {
                System.out.println("Foi encontrado o numero: " + nmr);
                break;
            }

            if (vet[meio] < nmr) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (inicio > fim) {
            System.out.println("Nao foi encontrado o numero: " + nmr);
        }

        rest = n - 1;

        System.out.println("Elementos que fora descartados durante a busca: " + rest);
    }
}