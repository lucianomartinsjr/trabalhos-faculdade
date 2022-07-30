import java.util.Scanner;

public class atvd5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, numlivros = 1;
		System.out.println("Informe numero menor ou igual a 0 para sair;");

		do {
			numlivros = sc.nextInt();
			if (numlivros <= 0) {
				break;
			}
			n = numlivros;
			int[] vetor = new int[n];
			int numlivr = 1;
			for (int i = 0; i < n; i++) {
				vetor[i] = sc.nextInt();
				numlivr++;
			}
			ordenaVetor(vetor, n);

			for (int i = 0; i < n; i++) {
				System.out.printf("\t|>  %04d  <|\n", vetor[i]);
			}
		} while (numlivros >= 0);
	}

	public static void ordenaVetor(int[] vetor, int n) {
		Scanner sc = new Scanner(System.in);
		int aux, menor;

		for (int i = 0; i < n; i++) {
			menor = i;
			for (int j = i + 1; j < n; j++) {
				if (vetor[j] < vetor[menor]) {
					menor = j;
				}
			}
			aux = vetor[i];
			vetor[i] = vetor[menor];
			vetor[menor] = aux;
		}
	}
}