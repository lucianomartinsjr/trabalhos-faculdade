public class atvd2 {
    public static void main(String[] args) {
        int []vetA = {92, 80, 71, 63, 55, 41, 39, 27, 14};
        int aux;

        System.out.println("Vetor desordenado: ");

        for(int i = 0; i < 9; i++){
            System.out.print(vetA[i] + " | ");
        }
        System.out.println(" ");

        for(int i = 0; i < vetA.length; i++){
            for(int j = 0; j < (vetA.length - 1) ; j++){ 
                if(vetA[j] > vetA[j + 1]){
                    aux = vetA[j];
                    vetA [j] = vetA[j + 1];
                    vetA[j + 1] = aux;
                    
                }
            }
        }
        System.out.println("Vetor ordenado: ");
        for(int i = 0; i < vetA.length; i++){
            System.out.print(vetA[i] + " | ");
        }
    }
}