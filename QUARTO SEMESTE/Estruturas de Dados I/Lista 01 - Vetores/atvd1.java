import java.util.Scanner;

public class atvd1
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A[] =  new int[9] ;
    
    for (int i=0; i<9;i++){
        System.out.printf("Informe a posição [%d] do vetor: ",i);
        A[i] = sc.nextInt();
        }
	
    for (int i=8; i>=0;i--){
    	    System.out.printf("[%d]",A[i]);
    	}
	}
}
