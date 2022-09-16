import java.util.Random;
public class atvd1{
    public static void main(String[] args) {
        Random random = new Random();

        int vetorA[] = new int[10];
        int somaMaiorQue12= 0 ,qntdIgual12= 0, j= 0;
        float mediaInferior12 = 0;

        System.out.println("- Vetor Informado -");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(100   );
            if (vetorA[i] < 12 ){
               mediaInferior12+=vetorA[i];
                j++;
            }

            else if (vetorA[i] == 12) 
                qntdIgual12++;    

            else
                somaMaiorQue12 += vetorA[i];
        
        
        System.out.printf(" %d ",vetorA[i]); 
        }

        System.out.printf("\n\nSoma dos numeros que são maiores que 12: %d\n",somaMaiorQue12);
        System.out.printf("Quantidade de elementos iguais a 12 : %d\n",qntdIgual12);

        mediaInferior12= mediaInferior12/j;
        System.out.printf("Media dos elementos que são inferiores a 12 : %.1f\n",mediaInferior12);
    }
}