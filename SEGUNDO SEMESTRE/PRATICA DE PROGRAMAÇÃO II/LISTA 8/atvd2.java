import java.util.Scanner;

public class atvd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = { 9, 75, 77, 18, 48, 14, 2, 4, 91, 57, 56, 29, 22, 5, 8, 60, 62, 93, 97, 7, 49, 87, 81, 71, 38, 78,
                99, 19, 31, 67 };
        int num, pos;
        int inicio = 0, meio, fim = vet.length - 1;

        for (int i = 0; i < vet.length - 1; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        System.out.print("Informe o numero que quer buscar: ");
        num = sc.nextInt();

        // Busca Binaria
        while (inicio <= fim) {
            meio = (fim + inicio) / 2;

            if (vet[meio] == num) {
                pos = meio;
                System.out.println("Foi encontrado o numero: " + num + ", na posicao: " + pos);
                break;
            } else if (vet[meio] < num) {
                inicio = meio + 1;

            } else {
                fim = meio - 1;
            }
        }

        if (inicio > fim) {
            System.out.println("Nao foi encontrado o numero: " + num);
        }
    }
}