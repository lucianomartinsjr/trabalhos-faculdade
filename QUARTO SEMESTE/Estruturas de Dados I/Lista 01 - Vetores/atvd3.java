import java.util.Scanner;

public class atvd3
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int soma = 0;
    int A[] =  new int[10] ;

    
    for (int i=0; i<10;i++){
        System.out.printf("Informe a posição [%d] do vetor: ",i);
        A[i] = sc.nextInt();
        
        if (A[i] % 5 == 0)
        soma += A[i];    

	}
    System.out.printf("Soma dos múltiplos de 5 do vetor a[] é: %d",soma);
	
    }
}