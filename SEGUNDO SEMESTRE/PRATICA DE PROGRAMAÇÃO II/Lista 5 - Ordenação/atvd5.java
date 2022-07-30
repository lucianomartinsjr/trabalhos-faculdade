public class atvd5 {
    public static void main(String[] args) {
        int[] v = { 82, 50, 71, 63, 85, 43, 39, 97, 14 };
        int chave, j;
        System.out.println("-=-=-=-=-=-=-=-=-=VETOR DESORDENADO=-=-=-=-=-=-=-=-=-");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");

        System.out.println("");
        for (int i = 1; i < v.length; i++) {
            chave = v[i];
            j = i - 1;
            while (j >= 0 && chave < v[j]) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = chave;

            for (int ij = 0; ij < v.length; ij++) {
                System.out.print(v[ij] + " ");
            }
            System.out.println("  Valor i:" + i + " valor j:" + j + " chave:" + chave);
            System.out.println("");
        }

        System.out.println("-=-=-=-=-=-=-=-=-=VETOR ORDENADO=-=-=-=-=-=-=-=-=-");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

    }
}
