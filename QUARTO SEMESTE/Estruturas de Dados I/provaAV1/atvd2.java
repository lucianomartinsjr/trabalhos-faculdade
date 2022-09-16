import java.util.Random;
public class atvd2 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int vetorA[] = new int[6];
        int vetorB[] = new int[6];
        int vetorC[] = new int[12];

        for(int i= 0;i<5;i++)
            {
                vetorA[i] = random.nextInt(99);
                vetorC[i] = vetorA[i];

                vetorB[i] = random.nextInt(99);
                vetorC[i+6]=vetorB[i];
    
            }

        System.out.println("-  Vetor A | Vetor B   - ");
            for(int i=0;i<5;i++){
                System.out.print("\t"+vetorA[i]+" | "+vetorB[i]+"\n");
            }


        System.out.println("");
        System.out.println("\t- Vetor C -");
            for(int i=0;i<11;i++){
                System.out.print(vetorC[i]+" ");
            }
    }
}
