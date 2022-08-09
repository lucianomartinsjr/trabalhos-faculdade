import java.util.Scanner;

public class atvd2
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int vetor1[] =  new int[10] ;
    int vetor2[] =  new int[10] ;
    
    for (int i=0; i<10;i++){
        System.out.printf("Informe a posição [%d] do vetor: ",i);
        vetor1[i] = sc.nextInt();
        
        vetor2[i] = vetor1[i] * i;
        }
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    System.out.println("\nVetor 1: \n");
    for (int i=0;i<10;i++){
        System.out.printf("[%d]",vetor1[i]);
        }
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    System.out.printf("\nVetor 2: \n");
    for(int i=0;i<10;i++){
        System.out.printf("[%d]",vetor2[i]);
        }
	}
}
