import java.util.Scanner;

public class atvd3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int num;

        System.out.print("Digite a quantidade de elementos do vetor: ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Informe o valor %d do vetor: ", i);
            vetor[i] = sc.nextInt();
        }

        System.out.print("Informe o valor que deseja procurar no vetor: ");
        num = sc.nextInt();

        final int posicao = buscaBin(vetor, num);

        resultado(vetor, num, posicao);
    }

    private static int buscaBin(int[] vet, int num) {
        ordernar(vet);

        int meio;
        int inicio = 0;
        int fim = vet.length - 1;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (num == vet[meio]) {
                return meio;
            } else if (num < vet[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        return -1;
    }

    private static void ordernar(int[] vet) {
        int aux;

        for (int i = 0; i < vet.length - 1; i++) {
            for (int k = 0; k < vet.length - i - 1; k++) {
                if (vet[k] > vet[k + 1]) {
                    aux = vet[k];
                    vet[k] = vet[k + 1];
                    vet[k + 1] = aux;
                }
            }
        }
    }

    private static void resultado(int[] vet, int num, int posicao) {
        if (posicao == -1) {
            System.out.println("Posicao do elemento procurado:" + posicao);
        } else {
            System.out.printf("O valor %d foi encontrado!\nPosicao do elemento procurado: %d.\n\n", num, posicao);
        }
    }
}