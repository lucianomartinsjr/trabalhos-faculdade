import java.util.*;
public class atvd8 {
public static void main(String[] args) {
    Random random = new Random();
    int matriz[][] = new int[15][5];
	int numRepetidos[] = new int[75];
	int numDeRepeticoes[] = new int[75];
	int contadorRepeticai = 0;

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(100);
				System.out.printf("%3d ", matriz[i][j]);
			}
			System.out.println();
		}
	

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < 15; k++) {
					for (int l = 0; l < 5; l++) {
						if (matriz[i][j] == matriz[k][l]) {
							numRepetidos[contadorRepeticai] = matriz[i][j];
							numDeRepeticoes[contadorRepeticai]++;
						}
					}
				}
				contadorRepeticai++;
			}
		}

		for(int i = 0; i < numDeRepeticoes.length; i++) {
			numDeRepeticoes[i]--;
		}

		contadorRepeticai = 0;
        System.out.printf("NUMERO | REPETICOES |\n" );
		for (int i = 0; i < numRepetidos.length; i++) {
			if (numDeRepeticoes[i] != 0) {
				System.out.printf(" %d  | %d\n", numRepetidos[i],numDeRepeticoes[i]);
				for (int j = 0; j < numRepetidos.length; j++) {
					if (numRepetidos[i] == numRepetidos[j]) {
						numDeRepeticoes[j] = 0;
					}
				}
			}
		}
    }
}