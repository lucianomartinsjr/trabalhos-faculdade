import java.util.Scanner;
public class atvd9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[20];
        int aux;

        for(int i=0; i<20; i++){
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("Informe um número: ");	
            vet[i]=sc.nextInt();
        }

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("O vetor informado foi:");
            for(int i=0; i<20; i++){
                System.out.print(vet[i]+" ");
            }

        for(int i=0; i<9; i++){
            aux = vet[i];
            vet[i]=vet[19-i];
            vet[19-i] = aux;
        }
        
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("\nAo inverter as posiçoes ficou: ");
            for(int i=0; i<20; i++){
                System.out.print(vet[i]+" ");
            }
    }
}
