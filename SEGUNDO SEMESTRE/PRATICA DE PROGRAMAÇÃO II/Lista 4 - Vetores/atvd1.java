import java.util.Scanner;
public class atvd1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vetorA[] = new int[20];
        int vetorB[] = new int[20];
        int aux;

        for(int i=0; i<20; i++){
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("Informe um número: ");	
            vetorA[i]=sc.nextInt();
        }

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("O vetor informado foi:");
            for(int i=0; i<20; i++){
                System.out.print(vetorA[i]+" ");
            }

        for(int i=0; i<20; i++){
            vetorB[i]=vetorA[19-i];
        }
        
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("\nAo inverter as posiçoes no vetor B ficou: ");
            for(int i=0; i<20; i++){
                System.out.print(vetorB[i]+" ");
            }
    }
}
