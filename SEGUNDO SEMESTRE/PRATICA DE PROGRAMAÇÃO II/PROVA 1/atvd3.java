import java.util.Scanner;
public class atvd3 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int vetA[]= new int [10];
        int vetB[]= new int [10];
        int vetC[] = new int [20];

        for(int i=0;i<10;i++){
            System.out.print("\nInforme o valor do vetor 1: ");
            vetA[i] = sc.nextInt();
            System.out.print("Informe o valor do vetor 2: ");
            vetB[i] = sc.nextInt();
        }

        int ia=0;

        for(int i=0;i<10;i++){
            vetC[ia] = vetA[i];
            ia+=2;
        } 
        
        ia=1;

        for(int i=0;i<10;i++){
            vetC[ia] = vetB[i];
            ia+=2;
        }

        System.out.println("\nVetor A: ");
        for(int i=0;i<10;i++){
            System.out.print(vetA[i]+" ");
        }

        System.out.println("\nVetor B: ");
        for(int i=0;i<10;i++){ 
            System.out.print(vetB[i]+" ");
        }

        System.out.println("\nVetor C: ");
        for(int i=0;i<20;i++){ 
            System.out.println(vetC[i]+" ");
        }
    }
    
}
