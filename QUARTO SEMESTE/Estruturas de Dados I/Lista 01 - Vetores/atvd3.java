import java.util.Scanner;

public class atvd3
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int soma = 0;
    int a[] =  new int[10] ;

    
    for (int i=0; i<10;i++){
        System.out.printf("Informe a posição [%d] do vetor: ",i);
        a[i] = sc.nextInt();
        
        if (a[i] % 5 == 0)
        soma += a[i];    

	}
    System.out.printf("Soma dos múltiplos de 5 do vetor a[] é: %d",soma);
	
    }
}