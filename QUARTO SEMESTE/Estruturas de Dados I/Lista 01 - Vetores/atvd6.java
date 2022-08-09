import java.util.Scanner;

public class atvd6
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A[] = new int[10] ;
    int B[] = new int[10];
    
    for (int i=0; i<10;i++){
        System.out.printf("Informe a posição [%d] do vetor: ",i);
        A[i] = sc.nextInt();
        
        B[9-i] = A[i];
        }
        
    imprimeVetor(A);
    System.out.printf("\n");
    imprimeVetor(B);
    }
    
    static void imprimeVetor(int[] vet)
    {
        for(int i=0;i<vet.length;i++){
            System.out.printf("[%d]", vet[i]);
        }
    }
}
