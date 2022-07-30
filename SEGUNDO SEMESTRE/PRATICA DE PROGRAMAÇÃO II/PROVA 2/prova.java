public class prova {
    public static void main(String[] args) {
        char[] v = { 'o', 'b', 'c', 'y', 'e', 'u', 'k', 'l', 'v', 'n', 'a' };
        char chave;
        int j;
        System.out.println("-=-=-=-=-=-=-=-=-=VETOR DESORDENADO=-=-=-=-=-=-=-=-=-");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.println("");
        for (int i = 1; i < v.length; i++) {
            chave = v[i];
            j = i - 1;

            while (j >= 0 && chave < v[j]) {
                v[j + 1] = v[j];
                j--;
            }

            v[j + 1] = chave;

        }

        System.out.println("-=-=-=-=-=-=-=-=-=VETOR ORDENADO=-=-=-=-=-=-=-=-=-");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

    }
}
