public class atvd1 {
    public static void main(String[] args) {
        int[] v = { 1, 8, 9, 2, 15, 20 };
        int aux;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < (v.length - 1); j++) {
                if (v[j] > v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    
                    System.out.println("");
                    for (int ij = 0; ij < v.length; ij++) {
                        System.out.print(v[ij] + " ");
                    }
                }
            }  
            System.out.println(""); 
        }

        System.out.println("-=-=-=-=-=-=-=-=-=VETOR ORDENADO=-=-=-=-=-=-=-=-=-");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

    }
}
