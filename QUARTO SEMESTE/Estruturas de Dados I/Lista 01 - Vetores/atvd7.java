import java.util.Scanner;

public class atvd7
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[6];
    int b[] = new int[6];
    int c[] = new int[12];
    
    for (int i=0; i<6;i++){
        System.out.printf("Informe a posição %d do vetor A: ",i);
        a[i]= sc.nextInt();
        System.out.printf("Informe a posição %d do vetor B: ",i);
        b[i]=sc.nextInt();
        
        c[i]=a[i];
        c[i+6]=b[i];
        
    }
    
    System.out.println("=-=-=-=-=-=-=-=-=- Vetor A =-=-=-=-=-=-=-=-=-");
    imprimirVetor(a);
    System.out.println("=-=-=-=-=-=-=-=-=- Vetor B =-=-=-=-=-=-=-=-=-");
    imprimirVetor(b);
    System.out.println("=-=-=-=-=-=-=-=-=- Vetor C =-=-=-=-=-=-=-=-=-");
    imprimirVetor(c);
    }
    
    static void imprimirVetor(int[] vet) {
        for(int i=0;i<vet.length;i++){
            System.out.printf("[%d]", vet[i]);
        }
    }

}
